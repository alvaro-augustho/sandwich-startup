package model.ingredients;

import com.google.gson.annotations.SerializedName;
import model.Ingredient;

/**
 * Created by aaugustho on 01/04/17.
 */
public class Queijo extends Ingredient {

    @SerializedName("description")
    private String description = "queijo";

    @SerializedName("price")
    private float price = 1.50f;

}
