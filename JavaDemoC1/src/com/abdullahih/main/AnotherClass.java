package com.abdullahih.main;

public class AnotherClass {

    private Integer number =20;
    public static  Integer sNumber=2;
//    public static final Integer sNumber=2;

    static {
        System.out.println("this is static block of another class");
    }
    public AnotherClass() {
        System.out.println("This is AnotherClass custom constructor");
    }

    public void anotherMethod(Integer anotherNumber){
        number = anotherNumber+number;
        sNumber = sNumber+anotherNumber;
        System.out.println("The another number: " + number);
        System.out.println("Final static value : "+sNumber);


    }
}
