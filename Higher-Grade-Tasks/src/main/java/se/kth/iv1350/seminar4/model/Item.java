package se.kth.iv1350.seminar4.model;

import se.kth.iv1350.seminar4.DTO.*;

public class Item {
    private int quantity;
    private String name;
    private double VAT;
    private double price;
    private String description;
    private String identifier;

    /**
     * This function creates a new instance of the Item class
     * @param item the item DtO to be converted
     */
    public Item(ItemDTO item){
        this.VAT = item.getVAT();
        this.name = item.getName();
        this.price = item.getPrice();
        this.description = item.getDescription();
        this.identifier = item.getIdentifier();
        this.quantity = 1;
    }


    /**
     * Updates the price of the item based on a discount
     * @param discount the discount that will be added to the price of the item
     */
    public void applyDiscount(DiscountDTO discount) {
        if (discount.getDiscountAmount() < 1){
            price *= 1 - discount.getDiscountAmount();
        }
        else {
            price -= discount.getDiscountAmount();
        }
    }

    
    /** 
     * Returns the quantity of a specific item
     * @return int the quantity
     */
    public int getQuantity(){
        return this.quantity;
    }

    
    /** 
     * Returns the name of the item
     * @return String the name
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * Returns the VAT of the item
     * @return double the VAT
     */
    public double getVAT(){
        return this.VAT;
    }

    
    /** 
     * Returns the price of the item
     * @return double the price
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * Returns the description of the item
     * @return String the description
     */
    public String getDescription(){
        return this.description;
    }

    
    /** 
     * Returns the identifier of the item
     * @return String the identifier
     */
    public String getIdentifier(){
        return this.identifier;
    }

    
    /**
     * Increases the item quantity
     * @return int the quantity
     */
    public void increaseQuantity() {
        quantity += 1;
    }
}
