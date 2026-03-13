package com.abdullahih.factory;

public class EmailNotification implements Notification {
// other code
    @Override
    public void notifyUser(String message) {
        System.out.println("Email Notification: " + message);
    }
}
