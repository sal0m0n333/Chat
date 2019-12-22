package com.example.chat;
import  java.util.Date;

public class Message {
    public String userName;
    public String textMessage;
    private  long messageTime;

    public Message() {}
    public Message(String userName, String textMessage)
    {
        this.userName = userName;
        this.textMessage = textMessage;

        this.messageTime = new Date().getTime();

    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String UserName) {
        this.userName = userName;
    }
    public String getTextMessage() {
        return textMessage;
    }
    public void setTextMessage(String TextMessage) {
        this.textMessage = textMessage;
    }
    public long getMessageTime() {
        return messageTime;
    }
    public void setMessageTime(long MessageTime){
        this.messageTime = messageTime;
    }



}
