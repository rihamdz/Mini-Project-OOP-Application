/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
public class Salle extends Building {
    public String accessoire;

    public Salle(int building_id, String building_name, double building_area, int Capacity,String accessoire) {
        super(building_id, building_name, building_area, Capacity);
        this.accessoire= accessoire;
        
        
}
   public void print_Salle_infos(){
       System.out.print("building_name"+super.building_name);
       System.out.print("building_area"+super.building_area);
       System.out.print("building_id"+super.building_id);
       System.out.print("Capacity"+super.Capacity);
       System.out.print("accessoire"+this.accessoire);
}
}