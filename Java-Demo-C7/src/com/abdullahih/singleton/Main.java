package com.abdullahih.singleton;
// Singleton Design Pattern
// one class one instance
public class Main {
    static void main(String[] args) {
        RegulerCitizen regulerCitizen1 = new RegulerCitizen("uak" ,1000,22);
        RegulerCitizen regulerCitizen2 = new RegulerCitizen("ufk" ,1700,22);
        System.out.println(regulerCitizen2.getIncomeTax());
        System.out.println(regulerCitizen1.getIncomeTax());

        GovtCitizen govtCitizen1 = new GovtCitizen("jihugyftd",9854);
        GovtCitizen govtCitizen2 = new GovtCitizen("jifsd",9054);
        System.out.println(govtCitizen1.getIncomeTax());
        System.out.println(govtCitizen2.getIncomeTax());
    }
}
