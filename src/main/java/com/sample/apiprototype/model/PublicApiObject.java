/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.apiprototype.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sbennett
 */
@XmlRootElement(name = "ApiObject")
public class PublicApiObject {
    private Long id;
    private String objectName;
    private String objectType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
}
