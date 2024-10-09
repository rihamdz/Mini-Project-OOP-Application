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
public class department {
    public int id;
    private String DepartementName;

    public void setDepartementName(String DepartementName) {
        this.DepartementName = DepartementName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setHeadname(String headname) {
        this.headname = headname;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getDepartementName() {
        return this.DepartementName;
    }

    public String getCode() {
        return this.code;
    }

    public String getHeadname() {
        return this.headname;
    }

    public String getEmail_address() {
        return this.email_address;
    }
    private String code;
    private String headname;
    private String email_address;

    public ArrayList<Block> getBlocks() {
        return Blocks;
    }

    public void setBlocks(ArrayList<Block> Blocks) {
        this.Blocks = Blocks;
    }
    private ArrayList<Block> Blocks = new ArrayList<Block>();
    public department( int id, String DepartementName, String code,String headname,String email_address,ArrayList<Block> Blocks ){
    this.DepartementName=DepartementName;
    this.code=code;
    this.email_address=email_address;
    this.headname=headname;
    this.id=id;
    this.Blocks=Blocks;

    
    }
    public void print_departement_infos(){
    System.out.println("the departement id is " +this.id);
    System.out.println("the departement name is " +this.DepartementName);
    System.out.println("the departement code "+this.code);
    System.out.println("the departement headname is " +this.headname);
    System.out.println("the departement email_address is " +this.email_address);
    for (int i=0;i< Blocks.size();i++){
       System.out.println("the block "+i+"is " + Blocks.get(i)); 
    }
    
    }
    public void getStudentlist(){
        
    }
}
