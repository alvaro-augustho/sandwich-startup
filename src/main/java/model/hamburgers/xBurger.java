package model.hamburgers;

import com.google.gson.annotations.SerializedName;
import model.Hamburger;
import model.Ingredient;
import model.ingredients.Bacon;
import model.ingredients.HamburguerCarne;
import model.ingredients.Queijo;

/**
 * Created by aaugustho on 01/04/17.
 */
public class xBurger extends Hamburger {

    @SerializedName("description")
    private String description = "x-burger";

    @SerializedName("listOfIngredients")
    private Ingredient[] listOfIngredients = new Ingredient[]{
            new HamburguerCarne(), new Queijo()
    };

}
