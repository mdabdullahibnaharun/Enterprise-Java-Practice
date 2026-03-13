package com.abdullahih.singleton;

import com.abdullahih.singleton.logic.TaxcalculationLogic;

public class GovtCitizen {
    private String name;
    private Integer income;
//    private Integer taxRate;
    public GovtCitizen(String name, Integer income) {
        this.name = name;
        this.income = income;
//        this.taxRate = taxRate;
        System.out.println("GovtCitizen constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getIncomeTax() {
//        TaxcalculationLogic taxcalculationLogic = new TaxcalculationLogic();
        TaxcalculationLogic taxcalculationLogic =  TaxcalculationLogic.getInstance();

        return taxcalculationLogic.getTaxCalculation(this.getIncome(), 12);
    }

//    public Integer getTaxRate() {
//        return taxRate;
//    }
//
//    public void setTaxRate(Integer taxRate) {
//        this.taxRate = taxRate;
//    }
}
