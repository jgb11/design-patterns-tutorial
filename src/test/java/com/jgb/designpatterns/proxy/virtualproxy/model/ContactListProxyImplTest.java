package com.jgb.designpatterns.proxy.virtualproxy.model;

import com.jgb.designpatterns.proxy.virtualproxy.Company;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author txoppe
 * @since 21/10/2017 | 21:17
 */
public class ContactListProxyImplTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEmployeeList() throws Exception {
        ContactList contactList = new ContactListProxyImpl();
        final Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());

        System.out.println("Requesting for contact list");

        assertThat("contactList must be proxy.", contactList, instanceOf(ContactListProxyImpl.class));

        contactList = company.getContactList();

        List<Employee> empList = contactList.getEmployeeList();
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

}