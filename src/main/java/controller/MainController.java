package controller;

import org.jboss.resteasy.annotations.GZIP;
import service.MainService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @GZIP
    public Response grandTotalController(@PathParam("param") String msg) {

        String result = "grand total";

        return Response.status(200).entity(result).build();

    }

}