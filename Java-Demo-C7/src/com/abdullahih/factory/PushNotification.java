package com.abdullahih.factory;

public class PushNotification implements Notification {
// other code
    @Override
    public void notifyUser(String message) {

        System.out.println("Push Notification: " + message);
    }
}
