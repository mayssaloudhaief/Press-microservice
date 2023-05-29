package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Subpart {
    @Id
    private String idSubpart;
    private String type ;


    public Subpart() {

    }

    public String getIdSubpart() {
        return idSubpart;
    }

    public void setIdSubpart(String idSubpart) {
        this.idSubpart = idSubpart;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
