package com.jgb.designpatterns.proxy.virtualproxy.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * @author txoppe
 * @since 21/10/2017 | 21:14
 */
public class ContactListProxyImpl implements ContactList {

    private static final Logger LOG = LogManager.getLogger(ContactListProxyImpl.class);

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            LOG.info("Creating contact list and fetching list of employees...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }

}
