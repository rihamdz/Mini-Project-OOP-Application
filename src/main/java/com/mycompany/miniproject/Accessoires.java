/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
public class Accessoires extends Materials {
    private String name;
    public Accessoires(int id, String registeration_number, String date_installion,String name) {
        super(id, registeration_number, date_installion);
        this.name=name;
    }
    public String getname(){
     return this.name;
     
    }
     public void setbrand_name(String name ){
        this.name=name;
    }
}
