package com.jgb.designpatterns.adapter;

import com.jgb.designpatterns.adapter.payd.PayD;
import com.jgb.designpatterns.adapter.payd.XPayToPayDAdapter;
import com.jgb.designpatterns.adapter.xpay.XPay;
import com.jgb.designpatterns.adapter.xpay.XPayImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author txoppe
 * @since 17/08/2017 | 21:27
 */
public class XPayToPayDAdapterTest {

    private XPay xPay;
    private PayD payD;

    @Before
    public void setUp() throws Exception {
        // Object for Xpay
        xPay = new XPayImpl();
        xPay.setCreditCardNo("4789565874102365");
        xPay.setCustomerName("Max Warner");
        xPay.setCardExpMonth("09");
        xPay.setCardExpYear("25");
        xPay.setCardCVVNo((short)235);
        xPay.setAmount(2565.23);

        payD = new XPayToPayDAdapter(xPay);
    }

    @Test
    public void testAdapter() throws Exception {
        assertEquals("Credit card number must be the same", xPay.getCreditCardNo(), payD.getCustCardNo());
        String payDCardExpMonthDateFormat = this.xPay.getCardExpMonth() + "/" + this.xPay.getCardExpYear();
        assertEquals("Adapted format must be the same", payDCardExpMonthDateFormat, payD.getCardExpMonthDate());
    }

}