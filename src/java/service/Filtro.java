/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.IOException;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author esnip
 */
@Provider
@PreMatching
public class Filtro implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext request) throws IOException {
        String url=request.getUriInfo().getAbsolutePath().toString();
        if(url.contains("api/auth"))
            return;
        String token=request.getHeaderString("Authorization");
         if(token==null){
             JsonObject json=Json.createObjectBuilder().add("Mensaje","Credenciales Incorrectas")
                     .build();
             request.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity(json).type(MediaType.APPLICATION_JSON).build());
             return;
        }
        if(!token.equals("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJub2xvc2VyaWNrcGFyZWNlZmFsc28iLCJpYXQiOjE2MjAyMDgzMjcsImV4cCI6MTYyMDIwOTIyNywiZW1haWwiOiJwZXNjYWRvZmVsaXpAZ21haWwuY29tIn0.vPEU0pkxztVaLQlobOOczNiJnMFT1ruwfXTSzQT8XIs")){
             JsonObject json=Json.createObjectBuilder().add("Mensaje","Credenciales Incorrectas")
                     .build();
             request.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity(json).entity(json).type(MediaType.APPLICATION_JSON).build());
             return;
        }
    }
    
}
