package com.katiko;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class Hello {

    @GET
    public String textHello() {
        return "Hello test";
    }

}