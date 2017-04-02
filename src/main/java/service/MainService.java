package service;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import jdk.nashorn.internal.parser.JSONParser;
import model.Hamburger;
import model.Ingredient;
import model.hamburgers.xBacon;
import model.hamburgers.xBurger;
import model.hamburgers.xEgg;
import model.hamburgers.xEggBacon;
import model.ingredients.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import utils.Exclude;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aaugustho on 01/04/17.
 */
public class MainService {

    private Hamburger[] menu = new Hamburger[]{new xBacon(), new xBurger(), new xEgg(), new xEggBacon()};
    private Ingredient[] ingredientsMenu = new Ingredient[]{new Alface(), new Bacon(), new HamburguerCarne(), new Ovo(), new Queijo()};

    public String menuListService() {
        Exclude ex = new Exclude();
        Gson gson = new GsonBuilder().addDeserializationExclusionStrategy(ex).addSerializationExclusionStrategy(ex).create();
        String menuJson = gson.toJson(Arrays.asList(this.menu), new TypeToken<List<Hamburger>>() {}.getType());
        return menuJson;
    }

    public String ingredientsListService() {
        Exclude ex = new Exclude();
        Gson gson = new GsonBuilder().addDeserializationExclusionStrategy(ex).addSerializationExclusionStrategy(ex).create();
        String menuJson = gson.toJson(Arrays.asList(this.ingredientsMenu), new TypeToken<List<Ingredient>>() {}.getType());
        return menuJson;
    }

    public String grandTotalService(String order) {

        ObjectMapper mapper = new ObjectMapper();

        List<Hamburger> orderList = null;

        try {
            orderList = mapper.readValue(order, new TypeReference<List<Hamburger>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        float grandTotal = 0.0f;
        for(Object h : orderList)
            grandTotal += ((Hamburger)h).getPrice();
        JsonObject jsonGrandTotal = new JsonObject();
        jsonGrandTotal.addProperty("grandTotal", grandTotal);
        return jsonGrandTotal.toString();
    }

}
