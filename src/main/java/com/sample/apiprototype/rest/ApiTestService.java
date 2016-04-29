/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.apiprototype.rest;

import com.sample.apiprototype.model.PrivateApiObject;
import com.sample.apiprototype.model.PublicApiObject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sbennett
 */
@Path("/objects/apiobject")
@RequestScoped
public class ApiTestService {
    private List<PublicApiObject> objects = new ArrayList<>();
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public PublicApiObject getApiObject(@PathParam("id") int id) {
        if (id == 1) {
            PublicApiObject publicObj = new PublicApiObject();
            publicObj.setId(1L);
            publicObj.setObjectName("Public Object");
            publicObj.setObjectType("A public object");
            return publicObj;
        } else {
            PrivateApiObject privateObj = new PrivateApiObject();
            privateObj.setId(2L);
            privateObj.setObjectName("Private Object");
            privateObj.setObjectType("A private object");
            privateObj.setPrivateName("Joe Private");
            privateObj.setPrivateTime(LocalDateTime.now());
            return privateObj;
        }
    }
}
