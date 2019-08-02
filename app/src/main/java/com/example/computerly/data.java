package com.example.computerly;

public class data {

    private String itemTitle;
    private String itemDescription;
    private int itemImage;

    public data(String itemTitle, String itemDescription, int itemImage) {
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
        this.itemImage=itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

}
