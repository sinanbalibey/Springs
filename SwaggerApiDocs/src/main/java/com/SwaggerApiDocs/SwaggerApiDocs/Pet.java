package com.SwaggerApiDocs.SwaggerApiDocs;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Benim Pet Nesnem",description = "Benim Pet")
public class Pet {



    @ApiModelProperty(value = "Pet Nesnesinin tekil Id alanı")
    private int id;

    @ApiModelProperty(value = "Pet Nesnesinin adı  alanı")
    private String name;

    @ApiModelProperty(value = "Pet Nesnesinin tekil tarih alanı")
    private Date date;

    public Pet(){

    }

    public Pet(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
