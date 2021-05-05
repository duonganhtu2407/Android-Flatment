package com.example.ongk;

public class Clothes {
    private int id;
    private String name;
    private String size;
    private String price;
    private String quantity;
    private int imagehinh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getImagehinh() {
        return imagehinh;
    }

    public void setImagehinh(int imagehinh) {
        this.imagehinh = imagehinh;
    }

    public Clothes(int id, String name, String size, String price, String quantity, int imagehinh) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
        this.imagehinh = imagehinh;
    }

    public Clothes() {
    }

    public Clothes(int id, String name, String price, int imagehinh) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imagehinh = imagehinh;
    }
}
