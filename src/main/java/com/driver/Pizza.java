package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = 0;
        this.bill = " ";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price += 80;
    }

    public void addExtraToppings(){
        if(this.isVeg) this.price += 70;
        else this.price += 120;
    }

    public void addTakeaway(){
        this.price += 20;
    }

    public String getBill(){
        this.bill = this.price + " ";
        return this.bill;
    }
}
