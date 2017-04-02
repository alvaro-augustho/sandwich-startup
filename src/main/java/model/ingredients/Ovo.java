package model.ingredients;

import com.google.gson.annotations.SerializedName;
import model.Ingredient;

/**
 * Created by aaugustho on 01/04/17.
 */
public class Ovo extends Ingredient {

    @SerializedName("description")
    private String description = "ovo";

    @SerializedName("price")
    private float price = 0.80f;

}
