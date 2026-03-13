package com.abdullahih.factory;

public class SmsNotification implements Notification {
// other code
    @Override
    public void notifyUser(String message) {

        System.out.println("Sms Notification: " + message);
    }
}
