 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author admin
 */
abstract public class Building {
    public int building_id;
    public String building_name;
    protected double building_area;
    protected int Capacity;
    
    public Building (int building_id,String building_name,double building_area,int Capacity){
    this.Capacity=Capacity;
    this.building_area=building_area;
    this.building_id=building_id;
    this.building_name=building_name;
    }
    public void occupation (){};
}
