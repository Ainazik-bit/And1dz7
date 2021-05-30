package com.example.and1dz7.models;

public class ExchangeModel {

    private int image;
    private String title;
    private double usd;

    public ExchangeModel() {
    }

    public ExchangeModel(int image, String title, double usd) {
        this.image = image;
        this.title = title;
        this.usd = usd;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }
}
