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

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}
