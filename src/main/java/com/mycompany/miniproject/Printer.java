/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
public class Printer extends Materials {
    private String brand_name;
    private int capacity;
    
       
        
    public Printer(int id, String registeration_number, String date_installion,String brand_name,int capacity) {
        super(id, registeration_number, date_installion);
        this.brand_name=brand_name;
        this.capacity=capacity;

  
    }
    public String getbrand_name(){
     return this.brand_name;
     
    }
     public void setbrand_name(String brand_name ){
        this.brand_name=brand_name;
    }
    public int getcapacity(){
     return this.capacity;
     
    }
     public void setcapacity(int capacity){
        this.capacity=capacity;
    }
   
    
}
