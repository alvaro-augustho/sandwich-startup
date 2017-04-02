package model.ingredients;

import com.google.gson.annotations.SerializedName;
import model.Ingredient;

/**
 * Created by aaugustho on 01/04/17.
 */
public class Bacon extends Ingredient {

    @SerializedName("description")
    private String description = "bacon";

    @SerializedName("price")
    private float price = 2.00f;

}
