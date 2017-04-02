package model.ingredients;

import com.google.gson.annotations.SerializedName;
import model.Ingredient;

/**
 * Created by aaugustho on 01/04/17.
 */
public class HamburguerCarne extends Ingredient {

    @SerializedName("description")
    private String description = "hambúrguer de carne";

    @SerializedName("price")
    private float price = 3.00f;

}
