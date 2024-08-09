package com.GraphQl.GraphQl.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Table
@Entity
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100,name = "vehicle_type")
    private String type;
    @Column(length = 100,name = "model_code")
    private String modelCode;
    @Column(length = 100,name = "brand_name")
    private String brandName;
    @Column(length = 100,name = "launch_date")
    private Date launchDate;

    public Vehicle(){

    }

    public Vehicle(Long id, String type, String modelCode, String brandName, Date launchDate) {
        this.id = id;
        this.type = type;
        this.modelCode = modelCode;
        this.brandName = brandName;
        this.launchDate = launchDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }
}
