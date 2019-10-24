package com.example.widgets;

public class SocialNet {
    private int img;
    private String title;
    private String subTitle;

    public SocialNet(int img, String title, String subTitle) {
        this.img = img;
        this.title = title;
        this.subTitle = subTitle;
    }

    public int getImg() {
        return img;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString(){
        return "SocialNet{" +
                "img=" + img +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}
