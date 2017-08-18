package com.jgb.designpatterns.adapter.payd;

/**
 * @author txoppe
 * @since 17/08/2017 | 21:18
 */

public interface PayD {

    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpMonthDate();
    Integer getCVVNo();
    Double getTotalAmount();

    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setCVVNo(Integer cVVNo);
    void setTotalAmount(Double totalAmount);
}
