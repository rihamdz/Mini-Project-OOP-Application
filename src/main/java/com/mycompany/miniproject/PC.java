/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.miniproject;
/**
 *
 * @author admin
 */
public class PC extends Materials{
    private String cpu;
    private String ram;
    
    public PC(int id, String registeration_number, String date_installion,String cpu,String ram) {
        super(id, registeration_number, date_installion);
        this.cpu=cpu;
        this.ram=ram;
        
    }
     public String getcpu(){
     return this.cpu;
     
    }
     public void setcpu(String cpu ){
        this.cpu=cpu;
    }
      public String getram(){
     return this.ram;
     
    }
     public void setram(String ram ){
        this.ram=ram;
    }
}
