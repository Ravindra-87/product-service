package com.ravi.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


public class ProductRequest {

    private String productName;
    private double productPrice;

    public ProductRequest(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
