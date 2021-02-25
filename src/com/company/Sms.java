package com.company;

public class Sms implements Readable {
    public String sender;
    public String message;

    public Sms(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public void read() {
        System.out.println(sender + " - " + message);
    }
}
