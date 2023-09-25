package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
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
            this.basePrice = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.basePrice = 400;
            this.toppingsPrice = 120;
        }
        this.price = basePrice;
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            this.price += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded){
            this.price += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillAdded) {
            this.bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
            if (isCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice+"\n";
            }
            if (isToppingsAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingsPrice+"\n";
            }
            if (isPaperBagAdded) {
                this.bill = this.bill + "Paperbag Added: " + this.paperBagPrice+"\n";
            }
            this.bill = this.bill + "Total Price: " + this.price+"\n";
            isBillAdded = true;
        }
        return this.bill;
    }
}
