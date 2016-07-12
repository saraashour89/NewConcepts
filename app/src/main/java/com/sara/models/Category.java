package com.sara.models;

/**
 * Created by Bassem on 7/12/2016.
 */
public class Category {

    private String name;
    private String img_url;

    public Category(String name, String img_url) {
        this.name = name;
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
