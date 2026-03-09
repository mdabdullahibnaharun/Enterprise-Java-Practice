package com.abdullahih.main;

public class pUser implements People{
    @Override
    public void doActivity() {
        System.out.println("doActivity");
    }

    @Override
    public void anotherDoActivity() {

    }

    @Override
    public void defaultDoActivity() {
        People.super.defaultDoActivity();
    }

    @Override
    public void doSomething() {
        People.super.doSomething();
    }

}
