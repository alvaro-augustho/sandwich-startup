package model;

import java.util.List;

/**
 * Created by aaugustho on 01/04/17.
 */
public abstract class Hamburger {

    Ingredient[] listOfIngredients;

    public Ingredient[] getIngredients() {
        return this.listOfIngredients;
    }

    public float getPrice() {
        float total = 0.0f;
        for(int i=0; i<this.listOfIngredients.length; i++) {
            total += this.listOfIngredients[i].getPrice();
        }
        return total;
    }

}
