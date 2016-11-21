/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author jarmo
 */
@Path("api")
public class Resource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Resource
     */
    public Resource() {
    }

    /**
     * Retrieves representation of an instance of rest.Resource
     * @param origin
     * @param destination
     * @return an instance of java.lang.String
     */
    @GET
    @Path("TwoParameters/{origin},{destination}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllFlightsTwoParams(@PathParam("origin") String origin, 
            @PathParam("destination") String destination) {
        
        String parameters = origin + ", " + destination;
        
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllFlightsAllParams() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllFlights() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of Resource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putXml(String content) {
    }
}
