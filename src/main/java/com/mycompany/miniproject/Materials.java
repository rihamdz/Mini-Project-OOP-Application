/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;
/**
 *
 * @author admin
 */
abstract public class Materials {
    public int id;
    public String registeration_number;
    public String date_installion;
    
    public String name;
    public  Materials (int id,String registeration_number,String date_installion){
           this.date_installion=date_installion;
            this.id=id;
            this.registeration_number=registeration_number;
            
    }
    public void print_Materials(){
         System.out.print(" Material id "+this.id);
         System.out.print(" Material registeration_number "+this.registeration_number);
          System.out.print(" Material date_installion "+this.date_installion);
    }
}
