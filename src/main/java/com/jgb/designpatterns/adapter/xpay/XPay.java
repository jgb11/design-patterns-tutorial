package com.jgb.designpatterns.adapter.xpay;

/**
 * @author txoppe
 * @since 17/08/2017 | 21:14
 */
public interface XPay {

    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    String getCardExpYear();
    Short getCardCVVNo();
    Double getAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);

}
