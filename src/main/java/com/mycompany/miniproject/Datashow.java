/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
public class Datashow extends Materials{
    private String brand_name;
    public Datashow(int id, String registeration_number, String date_installion,String brand_name) {
        super(id, registeration_number, date_installion);
        this.brand_name=brand_name;
    }
    public String getbrand_name(){
     return this.brand_name;
     
    }
     public void setbrand_name(String brand_name ){
        this.brand_name=brand_name;
    }
}
