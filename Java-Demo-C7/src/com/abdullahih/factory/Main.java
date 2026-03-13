package com.abdullahih.factory;
// fctory abstract pattern
public class Main {
    static void main(String[] args) {
        // need to send some notification
        // in this application we have 3 types of notification email, sms, push

        EmailNotification emailNotification = (EmailNotification) NotificationEngFactory.createNotificationEng("email");
        emailNotification.notifyUser("hello");
        SmsNotification smsNotification = (SmsNotification) NotificationEngFactory.createNotificationEng("sms");
        smsNotification.notifyUser("hello");
        PushNotification pushNotification = (PushNotification) NotificationEngFactory.createNotificationEng("push");
        pushNotification.notifyUser("hello");
    }
}
