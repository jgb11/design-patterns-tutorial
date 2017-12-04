package com.jgb.designpatterns.prototype;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * @author jgb
 * @since 04/12/2017 18:19
 */
public class PrototypeTest {

    @Test
    public void testPrototype() {

        final AccessControl userAccessControl1 = AccessControlProvider.getAccessControlObject("USER");
        assertThat("Must be of correct class type", userAccessControl1, instanceOf(AccessControl.class));
        final User user1 = new User("User A", "USER Level", userAccessControl1);

        System.out.println("************************************");
        System.out.println(user1);

        final AccessControl userAccessControl2 = AccessControlProvider.getAccessControlObject("USER");
        final User user2 = new User("User B", "USER Level", userAccessControl2);
        System.out.println("Changing access control of: " + user2.getUserName());
        assertEquals("Access must be the same", user2.getAccessControl().getAccess(), user1.getAccessControl().getAccess());
        user2.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user2);

        System.out.println("************************************");

        final AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        final User userManager = new User("User C", "MANAGER Level", managerAccessControl);
        assertEquals("Access must be the same", "GENERATE/READ REPORTS", userManager.getAccessControl().getAccess());
        System.out.println(userManager);
    }

    @Test
    public void testGetAccessControlObjectReturnsNull() {

        assertNull("AccessControl must be null for UNKNOWN", AccessControlProvider.getAccessControlObject("UNKNOWN"));

    }
}