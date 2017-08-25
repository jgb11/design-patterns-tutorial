package com.jgb.designpatterns.adapter.payd;

import com.jgb.designpatterns.adapter.xpay.XPay;

/**
 * @author txoppe
 * @since 17/08/2017 | 21:20
 */
public class XPayToPayDAdapter implements PayD {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final XPay xPay;

    public XPayToPayDAdapter(XPay xPay) {
        this.xPay = xPay;
        adaptXPayToPayD();
    }

    public String getCustCardNo() {
        return custCardNo;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    public Integer getCVVNo() {
        return cVVNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void adaptXPayToPayD() {
        setCardOwnerName(this.xPay.getCustomerName());
        setCustCardNo(this.xPay.getCreditCardNo());
        setCardExpMonthDate(this.xPay.getCardExpMonth() + "/" + this.xPay.getCardExpYear());
        setCVVNo(this.xPay.getCardCVVNo().intValue());
        setTotalAmount(this.xPay.getAmount());
    }
}
