package com.jgb.designpatterns.prototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AccessControlProvider {

    private static final Logger LOG = LogManager.getLogger(AccessControlProvider.class);

    private static final Map<String, AccessControl> map = new HashMap<>();

    static {
        LOG.info("Fetching data from external resources and creating access control objects...");
        map.put("USER", new AccessControl("USER", "DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"));
        map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
    }

    private AccessControlProvider() {
    }

    public static AccessControl getAccessControlObject(String controlLevel) {
        final Optional<AccessControl> optionalAccessControl = Optional.ofNullable(map.get(controlLevel));
        if(optionalAccessControl.isPresent()){
            return optionalAccessControl.get().clone();
        }
        return null;
    }
}
