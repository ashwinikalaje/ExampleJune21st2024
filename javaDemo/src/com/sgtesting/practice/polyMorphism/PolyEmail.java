package com.sgtesting.practice.polyMorphism;
abstract class Notification {
    abstract void notifyUser();
}

class EmailNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending email notification");
    }
}

class SMSNotification extends Notification {
    void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}
public class PolyEmail {
    public static void main(String[] args) {
        Notification notification = null;
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        notification=email;
        notification.notifyUser();

        notification=sms;
        notification.notifyUser();


    }
}
