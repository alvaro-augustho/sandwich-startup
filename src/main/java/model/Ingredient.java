package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by aaugustho on 01/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredient {

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private float price;

    public String getDescription() { return this.description; }
    public float getPrice() { return this.price; }

}
