package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/init")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "<a href=\"/home\">Go to home</a>";
    }
}