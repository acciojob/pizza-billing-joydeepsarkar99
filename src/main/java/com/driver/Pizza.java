package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            price += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            price += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded){
            price += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillAdded) {
            if (isCheeseAdded) {
                bill = bill + "Extra Cheese Added: " + this.cheesePrice +"\n";
            }
            if (isToppingsAdded) {
                bill = bill + "Extra Toppings Added: " + this.toppingsPrice +"\n";
            }
            if (isPaperBagAdded) {
                bill = bill + "Paperbag Added: " + this.paperBagPrice +"\n";
            }
            bill = bill + "Total Price: " + this.price;
            isBillAdded = true;
        }
        return this.bill;
    }
}
