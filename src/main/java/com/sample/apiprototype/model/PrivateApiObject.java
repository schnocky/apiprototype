/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.apiprototype.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sbennett
 */
@XmlRootElement(name = "ApiObject")
public class PrivateApiObject extends PublicApiObject {
    private String privateName;
    private LocalDateTime privateTime;

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public LocalDateTime getPrivateTime() {
        return privateTime;
    }

    public void setPrivateTime(LocalDateTime privateTime) {
        this.privateTime = privateTime;
    }
    
}
