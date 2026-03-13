package com.abdullahih.singleton.logic;

// lazy Singletone Designe pattern
public class TaxcalculationLogic {

    private  static TaxcalculationLogic instance=null;
    //    public TaxcalculationLogic() {
//        System.out.println("TaxcalculationLogic constructor called");
//    }
    private TaxcalculationLogic() {
        System.out.println("TaxcalculationLogic constructor called");
    }

//    public static TaxcalculationLogic getInstance() {
//        if(instance==null) {
//            instance = new TaxcalculationLogic();
//        }
//        return instance;
//    }

    public static synchronized TaxcalculationLogic getInstance() {
        if(instance==null) {
            instance = new TaxcalculationLogic();
        }
        return instance;
    }

    public TaxcalculationLogic getIncome() {
        return this.instance;
    }

    public Integer getTaxCalculation(Integer income, Integer incomeTax) {
        return income / incomeTax;
    }


}
