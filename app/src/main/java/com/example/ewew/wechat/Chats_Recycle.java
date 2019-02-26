package com.example.ewew.wechat;

public class Chats_Recycle {
    private int image;
    private String sign_text;
    private String content_text;
    private String time_text;

    public Chats_Recycle(int image, String sign_text, String content_text, String time_text) {
        this.image = image;
        this.sign_text = sign_text;
        this.content_text = content_text;
        this.time_text = time_text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSign_text() {
        return sign_text;
    }

    public void setSign_text(String sign_text) {
        this.sign_text = sign_text;
    }

    public String getContent_text() {
        return content_text;
    }

    public void setContent_text(String content_text) {
        this.content_text = content_text;
    }

    public String getTime_text() {
        return time_text;
    }

    public void setTime_text(String time_text) {
        this.time_text = time_text;
    }
}
