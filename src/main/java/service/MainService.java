package service;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import model.Hamburger;
import model.hamburgers.xBacon;
import model.hamburgers.xBurger;
import model.hamburgers.xEgg;
import model.hamburgers.xEggBacon;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aaugustho on 01/04/17.
 */
public class MainService {

    private Hamburger[] menu = new Hamburger[]{new xBacon(), new xBurger(), new xEgg(), new xEggBacon()};

    public String menuListService() {
        Gson gson = new Gson();
        String menuJson = gson.toJson(Arrays.asList(this.menu), new TypeToken<List<Hamburger>>() {}.getType());

        return menuJson;
    }

}
