package com.jgb.designpatterns.proxy.protectionproxy;

import com.jgb.designpatterns.proxy.protectionproxy.model.Employee;
import com.jgb.designpatterns.proxy.protectionproxy.model.Owner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author txoppe
 * @since 21/10/2017 | 21:36
 */
public class ReportGeneratorProtectionProxyTest {

    @Test
    public void generateDailyReport() throws Exception {
        Owner owner = new Owner();
        ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGenerator);

        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);
        System.out.println("For owner:");
        System.out.println(owner.generateDailyReport());
        System.out.println("For employee:");
        System.out.println(employee.generateDailyReport());
    }

}