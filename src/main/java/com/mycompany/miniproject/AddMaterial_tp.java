/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miniproject;



import com.sun.tools.javac.Main;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class AddMaterial_tp extends javax.swing.JFrame {
int Current_Salle_TP_Index=Main_Home.Current_Salle_TP_Index;
static ArrayList<Materials> m= new ArrayList<Materials>();
static ArrayList<Materials> f= new ArrayList<Materials>();

    /**
     * Creates new form AddMaterial_tp
     */
    public AddMaterial_tp(int Current_Salle_TP_Index) {
        
        initComponents();
     
       AddMaterial_tp.m.clear(); 
       setTitle("My JFrame");

        // Set the size of the JFrame
       

        // Set the background color of the JFrame
        getContentPane().setBackground(Color.white);

        // Show the JFrame
        setVisible(true);

        // Set the default close operation of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
     // m=Main_Home.salles.get(Current_Salle_TP_Index).getMaterials();
    }

   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        cpu_input = new javax.swing.JTextField();
        ram_input = new javax.swing.JTextField();
        R_number_input = new javax.swing.JTextField();
        l_date_input = new javax.swing.JTextField();
        product_name_input = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jButton2.setText("Save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpu_input.setBackground(new java.awt.Color(248, 199, 173));

        ram_input.setBackground(new java.awt.Color(248, 199, 173));

        R_number_input.setBackground(new java.awt.Color(248, 199, 173));

        l_date_input.setBackground(new java.awt.Color(248, 199, 173));

        product_name_input.setBackground(new java.awt.Color(248, 199, 173));

        Save.setBackground(new java.awt.Color(249, 134, 74));
        Save.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(249, 134, 74));
        jButton1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setText("CPU");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("Ram");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel3.setText("Registration Number");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel4.setText("Installation Date");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel5.setText("name");

        jComboBox1.setBackground(new java.awt.Color(248, 199, 173));
        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "Datashow", "Printer", "Accessoires" }));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel6.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ram_input, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpu_input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(R_number_input)
                            .addComponent(l_date_input, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(product_name_input))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpu_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ram_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_number_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
     int index= jComboBox1.getSelectedIndex();
// collect information inputs
String cpu= cpu_input.getText();
String ram =ram_input.getText();
String R_number = R_number_input.getText();
String Instl_date = l_date_input.getText();
String product_name = product_name_input.getText();


Materials mat = null;
        
       //AddMaterial_tp.m.clear();
     // m=Main_Home.salles.get(Current_Salle_TP_Index).getMaterials();
       switch (index) {
case 0:
{
// call constractor PC collect pc infos System.out.println("hello");
   Materials pc = new PC (0, R_number, Instl_date,cpu,ram);
   mat=pc;
   m.add(pc);
     break;
}
case 1:
// call Datashow constractor
Datashow datashow= new Datashow (1, R_number, Instl_date,product_name);
mat=datashow;
m.add(datashow);
break;
case 2:
// call Printer constractor
Printer printer = new Printer (2,R_number, Instl_date,product_name,0);
mat=printer;
m.add(printer); 
break;
case 3:
// call accessoire constractor
Accessoires accessoires= new Accessoires (3, R_number, Instl_date,product_name);
mat=accessoires;
m.add(accessoires) ;
break;

}
       //Main_Home.Material_table_Affiche.setModel(Main_Home.model);
       Main_Home.salles.get(Current_Salle_TP_Index).getMaterials().add(mat);


    }//GEN-LAST:event_SaveActionPerformed

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
   // Main_Home.salles.get(Current_Salle_TP_Index).setMaterials(m);
    Main_Home.print_salle_materials (Main_Home.salles.get(Current_Salle_TP_Index).getMaterials());

     // Main_Home.print_salle_materials (Main_Home.salles.get(Current_Salle_TP_Index).getMaterials());
      
    }//GEN-LAST:event_SaveMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        cpu_input.setText(null);
ram_input.setText(null);
R_number_input.setText(null);
l_date_input.setText(null);
product_name_input.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed
   /*
        
        */
    /*
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField R_number_input;
    private javax.swing.JButton Save;
    private javax.swing.JTextField cpu_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField l_date_input;
    private javax.swing.JTextField product_name_input;
    private javax.swing.JTextField ram_input;
    // End of variables declaration//GEN-END:variables
}