package model.hamburgers;

import com.google.gson.annotations.SerializedName;
import model.Hamburger;
import model.Ingredient;
import model.ingredients.HamburguerCarne;
import model.ingredients.Ovo;
import model.ingredients.Queijo;

/**
 * Created by aaugustho on 01/04/17.
 */
public class xEgg extends Hamburger {

    @SerializedName("description")
    private String description = "x-egg";

    @SerializedName("listOfIngredients")
    private Ingredient[] listOfIngredients = new Ingredient[]{
            new Ovo(), new HamburguerCarne(), new Queijo()
    };

    @SerializedName("price")
    private float price = 5.3f;

    @Override
    public float getPrice() {
        return this.price;
    }

}
