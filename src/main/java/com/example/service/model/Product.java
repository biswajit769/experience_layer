package com.example.service.model;

public class Product {

    private Long productID;
    private String productName;
    private Integer productPrice;
    //private String productImage;

    public Product() {
        super();
    }

    public Product(Long productID, String productName, Integer productPrice, String productImage) {
        super();
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        //this.productImage = productImage;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
    
//    public String getProductImage() {
//        return productImage;
//    }
//
//    public void setProductImage(String productImage) {
//        this.productImage = productImage;
//    }
    
}
