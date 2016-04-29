/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.apiprototype.rest;

import com.fasterxml.jackson.annotation.JsonView;
import com.sample.apiprototype.model.FlatPrivateApiObject;
import com.sample.apiprototype.model.Views;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sbennett
 */
@Path("/objects/filter")
@RequestScoped
public class JsonViewTestService {

    @GET
    @Path("/private")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @JsonView(Views.Private.class)
    public FlatPrivateApiObject getPrivateApiObject() {
        return getApiObject("Private");
    }

    @GET
    @Path("/public")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @JsonView(Views.Public.class)
    public FlatPrivateApiObject getPublicApiObject() {
        return getApiObject("Public");
    }

    private FlatPrivateApiObject getApiObject(String inputStr) {
        FlatPrivateApiObject privateObj = new FlatPrivateApiObject();
        privateObj.setId(2L);
        privateObj.setObjectName(inputStr.concat(" Object"));
        privateObj.setObjectType("An object");
        privateObj.setPrivateName("Joe ".concat(inputStr));
        privateObj.setPrivateTime(new Date());
        return privateObj;
    }

}
