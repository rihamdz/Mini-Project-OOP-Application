/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
public class institution {
    public int id;
    private String type;
    private String Address;
    private String phone_number;
    private String logo_ur1;
    private department[] dep= new department[2];

    public department[] getDep() {
        return dep;
    }
    public institution (int id,String type,String Address,String phone_number,String logo_ur1,department[] dep){
    this.Address=Address;
    this.dep=dep;
    this.id=id;
    this.logo_ur1=logo_ur1;
    this.phone_number=phone_number;
    this.type=type;
   
    }

   
   public void graduateStudent(){};
     public String gettype(){
     return this.type;
     
    }
     public void settype(String type ){
        this.type=type;
    }
      public String getAddress(){
     return this.Address;
     
    }
     public void setAddress(String Address ){
        this.Address=Address;
    }
       public String getphone_number(){
     return this.phone_number;
     
    }
     public void setphone_number(String phone_number ){
        this.phone_number=phone_number;
    }
       public String getlogo_ur1(){
     return this.logo_ur1;
     
    }
     public void setlogo_ur1(String logo_ur1 ){
        this.logo_ur1=logo_ur1;
    }
}
