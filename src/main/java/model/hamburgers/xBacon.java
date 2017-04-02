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
public class xBacon extends Hamburger {

    @SerializedName("description")
    private String description = "x-bacon";

    @SerializedName("listOfIngredients")
    private Ingredient[] listOfIngredients   = new Ingredient[]{
            new Bacon(), new HamburguerCarne(), new Queijo()
    };

}
