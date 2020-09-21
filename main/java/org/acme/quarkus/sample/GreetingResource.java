package org.acme.quarkus.sample;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    public static final String TOKEN="dev";
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name")String name ) {
        
        return String.format("Hello %s,your id is %s", name, UUID.randomUUID().toString());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello( ) {
        return("Hello");
        //return String.format("Hello %s,your id is %s", UUID.randomUUID().toString(), UUID.randomUUID().toString());
    }
}