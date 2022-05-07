/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java_uzi8app;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*

   @author : Dheeraj Maheshwari
   This Java project is based on Quiz management system
  

*/
public class Quiz_form extends javax.swing.JFrame {
    
    // create an array of que    
 
    String[] que = {"10 + 50 = ?","30 X 50 = ?","100-30 = ?","20+30 = ? ","100/50 = ? "};
    // create an array of option ( the last option  is answer )
   String[][] op = {{"-1","-4","60","40","60"},{"3","60","1500","1800","1500"},{"2","70","30","67","70"},{"1","50","200","-50","50"},{"4","2","1","3","2"}};
     
    // indez->for question
   // cor-> to count cor question
     int index = 0, cor = 0;
     ButtonGroup bg = new ButtonGroup();
    

     //  Creates new form Quiz_form
    public Quiz_form() {
        initComponents();
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        jButton_Next_QActionPerformed(null);
    }
     
     public void getSelectedOption(JRadioButton rbtn)
    {
        
        // get the chosen value fro radiobutton
        System.out.println(rbtn.getText());
        System.out.println(op[index][4]);

        if(rbtn.getText().equals(op[index][4]))
        {
            // increase the count correct answer
            cor++;
           
        }
        // increase the indx 
        index++;
        
        // disable the radiobuttons
        enableRbuttons(false);
       
    }


    // enable/ disable radiobuttons
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
    }
   
      //  This method is called from within the constructor to initialize the form.
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Q_container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Q_container.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Questions display here ?");

        javax.swing.GroupLayout jPanel_Q_containerLayout = new javax.swing.GroupLayout(jPanel_Q_container);
        jPanel_Q_container.setLayout(jPanel_Q_containerLayout);
        jPanel_Q_containerLayout.setHorizontalGroup(
            jPanel_Q_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );
        jPanel_Q_containerLayout.setVerticalGroup(
            jPanel_Q_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_containerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jRadioButton1_.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton1_.setText("jRadioButton2");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton2_.setText("jRadioButton1");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel_Q_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1_, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton3_, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton4_, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton2_, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jRadioButton2_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4_)
                .addGap(36, 36, 36)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
         if(jButton_Next_Q.getText().equals("Restart The Quiz"))
        {
            // for starting the quiz again(restarting)
            jButton_Next_Q.setText("Next");
            jPanel_Q_container.setBackground(new java.awt.Color(204, 204, 204));
            index = 0;
            cor = 0;
        }
        
        if(index == que.length)
        {
            // display the user score
            Lbl_Question.setText("Your Score: " + cor + " / " + que.length);
            if(cor >= (float) que.length/2)
            {
              jPanel_Q_container.setBackground(Color.green);
            }
            else{
               jPanel_Q_container.setBackground(Color.red);
            }
            
            jButton_Next_Q.setText("Restart The Quiz");
        }
        
        else{
               // enable radio buttons
             enableRbuttons(true);

             // display the next question
             Lbl_Question.setText(que[index]);
             jRadioButton1_.setText(op[index][0]);
             jRadioButton2_.setText(op[index][1]);
             jRadioButton3_.setText(op[index][2]);
             jRadioButton4_.setText(op[index][3]);
             
             if(index == que.length-1){
                 jButton_Next_Q.setText("Finish and See The Result");
             }
            
        }
        
        
        bg.clearSelection(); 
       
       
       
    }//GEN-LAST:event_jButton_Next_QActionPerformed

     /**
    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jRadioButton2_ActionPerformed
 * */
    
    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
        getSelectedOption(jRadioButton1_);
    }//GEN-LAST:event_jRadioButton1_ActionPerformed
     
     private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        getSelectedOption(jRadioButton2_);
    }  
   
    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    
    
    
                                               

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Quiz_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
