package com.example.sanapli.domain;

import kotlin.text.UStringsKt;

public class PopularDomain {
    private UStringsKt title;
    private UStringsKt  picurl;
    private int review;
    private double score;
    private int numInChart;
    private double price;

    public PopularDomain(UStringsKt title, UStringsKt picurl, int review, double score, double price) {
        this.title = title;
        this.picurl = picurl;
        this.review = review;
        this.score = score;
        this.price = price;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(UStringsKt title) {
        this.title = title;
    }

    public String getPicurl() {
        return picurl.toString();
    }

    public void setPicurl(UStringsKt picurl) {
        this.picurl = picurl;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getNumInChart() {
        return numInChart;
    }

    public void setNumInChart(int numInChart) {
        this.numInChart = numInChart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
