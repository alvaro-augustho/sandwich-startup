package controller;

import com.google.gson.JsonArray;
import org.jboss.resteasy.annotations.GZIP;
import service.MainService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/menu")
public class MainController {

    private MainService mainService = new MainService();

    @GET
    @Path("/list")
    @GZIP
    public Response menuListController() {
        String result = mainService.menuListService();
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/ingredients/list")
    @GZIP
    public Response ingredientsListController() {
        String result = mainService.ingredientsListService();
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path("/grandtotal")
    @Consumes("application/json")
    @GZIP
    public Response grandTotalController(String order) {
        String result = mainService.grandTotalService(order);
        return Response.status(200).entity(result).build();

    }

}