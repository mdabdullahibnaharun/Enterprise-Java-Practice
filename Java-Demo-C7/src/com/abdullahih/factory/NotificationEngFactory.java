package com.abdullahih.factory;

public class NotificationEngFactory {
    public static Notification createNotificationEng(String notificationType) {
       return switch (notificationType) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "push" -> new PushNotification();
            default -> null;
        };
    }
}
