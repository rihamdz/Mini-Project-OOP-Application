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
public class TP_Salle extends Salle {
    
    public boolean isActive;

 
  public ArrayList<Materials> materials = new ArrayList<Materials>();
   
    public TP_Salle(int building_id, String building_name, double building_area, int Capacity, String accessoire,ArrayList<Materials> materials) {
        super(building_id, building_name, building_area, Capacity, accessoire);
       this.isActive=isActive;
   
}
 public void print_SalleTP_infos(){
     super.print_Salle_infos();
     System.out.println(" TP_Salle isActive "+this.isActive);
     for (int i=0;i< materials.size();i++){
        materials.get(i).print_Materials(); 
    }
 }

   public ArrayList<Materials> getMaterials() {
        return this.materials;
    }

   

    public void add_material_to_TPSalle(ArrayList<Materials> m) {
          this.getMaterials().addAll(m);
        

    }

    public void setMaterials(ArrayList<Materials> materials) {
        this.materials = materials;
    }

   
   
}
