package com.abdullahih.main;

public interface People {

    public void doActivity();
//
    public void anotherDoActivity();

    default void defaultDoActivity() {
        System.out.println("default doActivity");
        commonCode();
    }
    private void commonCode() {
        System.out.println("Eat,Sleep,Code");
    }

    default  void doSomething(){
        System.out.println("doSomething");
    }
}
