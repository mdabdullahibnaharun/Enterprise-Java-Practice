package com.abdullahih.main;

//public sealed class User permits People, pUser, User{
public  class User{
private Integer userId;
    private String fullName;
    private String country;

    public User(Integer userId, String country, String fullName) {
        this.userId = userId;
        this.country = country;
        this.fullName = fullName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


//    public void printDetails() {
//        System.out.println( "User{" +
//                "userId=" + userId +
//                ", fullName='" + fullName + '\'' +
//                ", country='" + country + '\'' +
//                '}');
//    }

//    public boolean printDetails() {
//        System.out.println( "User{" +
//                "userId=" + userId +
//                ", fullName='" + fullName + '\'' +
//                ", country='" + country + '\'' +
//                '}');
//        return true;
//    }

    public boolean printDetails() {
        System.out.println("""
                uid = 1
                full name = pk
                country = country
                """);
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
