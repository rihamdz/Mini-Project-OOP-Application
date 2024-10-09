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
public class Block {
    public String Block_name;
    public String Block_localisation;
    public String Wals_color;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
   private ArrayList<Building> buildings = new ArrayList<Building>();
    
    public Block(String Block_name, String Block_localisation, String Wals_color){
    this.Block_localisation=Block_localisation;
    this.Block_name=Block_name;
    this.Wals_color=Wals_color;
 
    }
   public void setBuildings(ArrayList<Building> buildings){
   this.buildings=buildings;
   } 
}
