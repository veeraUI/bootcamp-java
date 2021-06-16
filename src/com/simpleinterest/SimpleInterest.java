package com.simpleinterest;

import java.math.BigDecimal;

public class SimpleInterest {

    private BigDecimal principle;
    private BigDecimal interest;
    private BigDecimal totalAmount;

    SimpleInterest(){

    }

    public BigDecimal getInterest() {
        return interest;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPrinciple() {
        return principle;
    }

    public void  setPrinciple(String principle) {
        this.principle = new BigDecimal(principle);
    }
    public void  setInterest(String interest) {
        this.interest = new BigDecimal(interest);
    }

    SimpleInterest(String principle, String interest){
        setInterest(interest);
        setPrinciple(principle);
    }
    public BigDecimal calculateTotalValue(int noOfYears) {

        setTotalAmount(principle.add(principle.multiply(interest).multiply(new BigDecimal(noOfYears))));

        return getTotalAmount();
    }

    public void printTotalAmount() {
        System.out.printf("The total amount is : %f", getTotalAmount());
    }
}
