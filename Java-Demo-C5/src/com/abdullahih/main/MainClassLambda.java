package com.abdullahih.main;

import java.util.function.BiFunction;
import java.util.function.Function;

// lambda expression Java8
public class MainClassLambda {
    static void main(String[] args) {
//        System.out.println(multiplyByTwo(2,3));

        Function<Integer,Integer>  multiplyByTwo = (num) -> num*2;
        System.out.println(multiplyByTwo.apply(2));

        BiFunction<Integer,Integer,Integer> multiplyByNum = (num1, num2) -> num1*num2;
        System.out.println(multiplyByNum.apply(2,3));

        TriFunction<Integer,Integer,Integer,Integer> multiplyByNum3 = (num1, num2, num3) -> num1*num2+num3;
        System.out.println(multiplyByNum3.apply(2,3,4));

    }

//    public static Integer multiplyByTwo(Integer a,Integer b){
//        return a*b*2;
//    }
}
