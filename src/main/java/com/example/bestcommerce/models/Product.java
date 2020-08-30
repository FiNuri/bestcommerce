package com.example.bestcommerce.models;

public class Product {
    private Category category;
    private PaymentOptions paymentOptions;
    private String name, description, deliveryOptions;
    private int inventory;
    private float price;
//    private Merchant ownerMerch;

//    public Merchant getOwnerMerch() {
//        return ownerMerch;
//    }
//
//    public void setOwnerMerch(Merchant ownerMerch) {
//        this.ownerMerch = ownerMerch;
//    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(PaymentOptions paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(String deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", paymentOptions=" + paymentOptions +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deliveryOptions='" + deliveryOptions + '\'' +
                ", inventory=" + inventory +
                ", price=" + price +
                '}';
    }
}
