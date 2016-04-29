/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.apiprototype.model;

import com.fasterxml.jackson.annotation.JsonView;
import java.time.LocalDateTime;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sbennett
 */
@XmlRootElement(name = "ApiObject")
public class FlatPrivateApiObject {
    @JsonView(Views.Public.class)
    private Long id;
    @JsonView(Views.Public.class)
    private String objectName;
    @JsonView(Views.Public.class)
    private String objectType;
    @JsonView(Views.Private.class)
    private String privateName;
    @JsonView(Views.Private.class)
    private Date privateTime;

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

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public Date getPrivateTime() {
        return privateTime;
    }

    public void setPrivateTime(Date privateTime) {
        this.privateTime = privateTime;
    }
    
}
