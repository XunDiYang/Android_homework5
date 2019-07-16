package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json


    @SerializedName("id")
    String id;
    @SerializedName("url")
    String url;
    @SerializedName("width")
    int width;
    @SerializedName("height")
    int height;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override public String toString() {
        return "Cat{" +
                "id=" + id +
                ", Width='" + width + '\'' +
                ", Height=" + height +
                '}';
    }
}
