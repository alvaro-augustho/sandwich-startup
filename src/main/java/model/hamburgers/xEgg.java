package model.hamburgers;

import model.Hamburger;
import model.Ingredient;
import model.ingredients.HamburguerCarne;
import model.ingredients.Ovo;
import model.ingredients.Queijo;

/**
 * Created by aaugustho on 01/04/17.
 */
public class xEgg extends Hamburger {

    private Ingredient[] listOfIngredients = new Ingredient[]{
            new Ovo(), new HamburguerCarne(), new Queijo()
    };

}