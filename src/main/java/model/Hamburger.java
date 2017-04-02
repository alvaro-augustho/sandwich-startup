package model;

import com.google.gson.annotations.SerializedName;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by aaugustho on 01/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hamburger {

    @JsonProperty("description")
    private String description;

    @JsonProperty("listOfIngredients")
    private Ingredient[] listOfIngredients;

    public String getDescription() { return this.description; }

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
