/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject.tang.chen;

import java.awt.Color;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
public class ChoiceOfSurvey extends javax.swing.JFrame {
    Welcome firstWindow;
    SelectSurvey selectSurvey;
    
    /**
     * Creates new form ChoiceOfSurvey
     */
    public ChoiceOfSurvey(Welcome m) {
        initComponents();
        firstWindow = m;
        getContentPane().setBackground(new Color(153, 204, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnMakeJava = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        btnMakeGoogleForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Which Type Of Survey?");

        btnBack.setBackground(new java.awt.Color(255, 212, 26));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnMakeJava.setBackground(new java.awt.Color(255, 212, 26));
        btnMakeJava.setText("On Java");
        btnMakeJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeJavaActionPerformed(evt);
            }
        });

        lblQuestion.setText("Which Type Of Survey Would You Like To Create?");

        btnMakeGoogleForm.setBackground(new java.awt.Color(255, 212, 26));
        btnMakeGoogleForm.setText("On Google Forms");
        btnMakeGoogleForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeGoogleFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnMakeJava))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnMakeGoogleForm)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblQuestion)
                .addGap(38, 38, 38)
                .addComponent(btnMakeJava)
                .addGap(43, 43, 43)
                .addComponent(btnMakeGoogleForm)
                .addGap(39, 39, 39)
                .addComponent(btnBack)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMakeJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeJavaActionPerformed
        if(selectSurvey == null){
            selectSurvey = new SelectSurvey(this);
        }
        
        selectSurvey.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMakeJavaActionPerformed

    private void btnMakeGoogleFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeGoogleFormActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(new URI("https://docs.google.com/forms/u/0/?tgif=c"));
        }catch(IOException e){
            JOptionPane.showInputDialog(null, "ERROR: " + e);
        }catch(URISyntaxException e){
            JOptionPane.showInputDialog(null, "ERROR: " + e);
        }
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMakeGoogleFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMakeGoogleForm;
    private javax.swing.JButton btnMakeJava;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables
}
