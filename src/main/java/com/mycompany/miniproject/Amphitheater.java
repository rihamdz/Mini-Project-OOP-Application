/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class Amphitheater extends Building {
    public Boolean Availability;
     ArrayList<Materials> materials = new ArrayList<Materials>();
    public Amphitheater(int building_id, String building_name, double building_area, int Capacity,Boolean Availability,ArrayList<Materials> materials) {
        super(building_id, building_name, building_area, Capacity);
        this.Availability=Availability;
        this.materials=materials;
    }
    
   public void print_Amphitheater_infos(){
       System.out.print("building_name "+super.building_name);
       System.out.print("building_area "+super.building_area);
       System.out.print("building_id "+super.building_id);
       System.out.print("Capacity "+super.Capacity);
       System.out.print("Availability "+this.Availability);
        for (int i=0;i< materials.size();i++){
            materials.get(i).print_Materials(); 
    }
   } 
}
