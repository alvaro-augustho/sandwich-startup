package model.hamburgers;

import model.Hamburger;
import model.Ingredient;
import model.ingredients.Bacon;
import model.ingredients.HamburguerCarne;
import model.ingredients.Queijo;

/**
 * Created by aaugustho on 01/04/17.
 */
public class xBacon extends Hamburger {

    private Ingredient[] listOfIngredients   = new Ingredient[]{
            new Bacon(), new HamburguerCarne(), new Queijo()
    };

}
