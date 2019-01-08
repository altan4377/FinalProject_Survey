/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject.tang.chen;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author altan4377
 */
public class SelectSurvey extends javax.swing.JFrame {
    ChoiceOfSurvey choice;
    MakeSurvey makeSurvey;
    
    public SelectSurvey(ChoiceOfSurvey c) {
        initComponents();
        choice = c;
        getContentPane().setBackground(new Color(153, 204, 255));
        setExistingSurvey();
    }

    public void setExistingSurvey(){
//        ArrayList<String> questions = new ArrayList();
        try{
            FileReader fr = new FileReader("src\\finalproject\\tang\\chen\\SurveyStorage");
            BufferedReader br = new BufferedReader(fr);
            boolean eof = false;
            while(!eof){
//                questions.add(br.readLine());
                String title = br.readLine();
                if(title == null){
                    eof = true;
                }else{
                    cboSurveys.addItem(title);
                }
            }    
            br.close();
        }catch(IOException e){
            System.out.println("ERROR " + e);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExisting = new javax.swing.JButton();
        cboSurveys = new javax.swing.JComboBox();
        btnNew = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        lblExisting = new javax.swing.JLabel();
        lblNew = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExisting.setBackground(new java.awt.Color(255, 212, 26));
        btnExisting.setText("GO!");
        btnExisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExistingActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(255, 212, 26));
        btnNew.setText("NEW!");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        lblQuestion.setText("Which Survey Are You Working On?");

        lblExisting.setText("Existing Survey");

        lblNew.setText("New Survey");

        btnBack.setBackground(new java.awt.Color(255, 212, 26));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExisting)
                            .addComponent(lblNew))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboSurveys, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExisting))))
                    .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblQuestion)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExisting)
                    .addComponent(cboSurveys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExisting))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(lblNew))
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        choice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(makeSurvey == null){
            makeSurvey = new MakeSurvey(this);
        }
        
        makeSurvey.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnExistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExistingActionPerformed
        if(makeSurvey == null){
            makeSurvey = new MakeSurvey(this);
        }
        
        makeSurvey.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExistingActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExisting;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboSurveys;
    private javax.swing.JLabel lblExisting;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables
}