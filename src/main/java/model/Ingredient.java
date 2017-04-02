package model;

/**
 * Created by aaugustho on 01/04/17.
 */
public abstract class Ingredient {

    private transient String description;
    private transient float price;

    public String getDescription() { return this.description; }
    public float getPrice() { return this.price; }

}
