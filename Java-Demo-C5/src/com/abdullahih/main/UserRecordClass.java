package com.abdullahih.main;

public record UserRecordClass (int id, String fullName, String Country) {
     public Object mymethod(){
         return fullName();
     }
}
