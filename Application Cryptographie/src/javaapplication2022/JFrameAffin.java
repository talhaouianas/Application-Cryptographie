/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2022;
import Importation.Affin;
import java.util.Arrays;
/**
 *
 * @author anas
 */
public class JFrameAffin extends javax.swing.JFrame {

    
    /**
     * Creates new form JFrameCesar
     */
    public JFrameAffin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TexteCry = new javax.swing.JEditorPane();
        Chefri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDec = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textC = new javax.swing.JEditorPane();
        Dechefri = new javax.swing.JButton();
        key1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Affine");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 520));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Importation/1-removebg-preview.png"))); // NOI18N

        jScrollPane2.setViewportView(TexteCry);

        Chefri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Importation/l.png"))); // NOI18N
        Chefri.setBorder(null);
        Chefri.setBorderPainted(false);
        Chefri.setContentAreaFilled(false);
        Chefri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chefri.setFocusPainted(false);
        Chefri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChefriActionPerformed(evt);
            }
        });

        TextDec.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(TextDec);

        textC.setPreferredSize(new java.awt.Dimension(200, 20));
        jScrollPane3.setViewportView(textC);

        Dechefri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Importation/u.png"))); // NOI18N
        Dechefri.setBorder(null);
        Dechefri.setBorderPainted(false);
        Dechefri.setContentAreaFilled(false);
        Dechefri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dechefri.setFocusPainted(false);
        Dechefri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DechefriActionPerformed(evt);
            }
        });

        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Importation/msg.png"))); // NOI18N

        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Importation/key.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(key, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(key1))
                                .addGap(101, 101, 101))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Chefri, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Dechefri, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Chefri)
                        .addGap(18, 18, 18)
                        .addComponent(Dechefri))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key1ActionPerformed

    private void DechefriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DechefriActionPerformed
        String textclair = TexteCry.getText();
        int[] code= new int[textclair.length()];
        char[] codecry = new char[textclair.length()];
        Affin message = new Affin();
        for(int i=0;i<textclair.length();i++){
            code[i]=message.Codagenum(textclair)[i];
        }
        for(int i=0;i<textclair.length();i++){
            codecry[i]= message.Decryptagea(code,Integer.parseInt(key.getText()),Integer.parseInt(key1.getText()),textclair.toCharArray())[i];
        }
        String result = "";
        for(int i=0;i<textclair.length();i++){
            result += Character.toString(codecry[i]);
        }
        TextDec.setText(result);
    }//GEN-LAST:event_DechefriActionPerformed

    private void ChefriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChefriActionPerformed
        // TODO add your handling code here:
        String textclair = textC.getText();
        textclair = textclair.toUpperCase();
        int[] code= new int[textclair.length()];
        char[] codecry = new char[textclair.length()];
        Affin message = new Affin();
        for(int i=0;i<textclair.length();i++){
            code[i]=message.Codagenum(textclair)[i];
        }

        for(int i=0;i<textclair.length();i++){
            codecry[i]= message.Cryptagea(code,Integer.parseInt(key.getText()),Integer.parseInt(key1.getText()))[i];
        }
        String result = "";
        for(int i=0;i<textclair.length();i++){
            result += Character.toString(codecry[i]);
        }
        TexteCry.setText(result);
    }//GEN-LAST:event_ChefriActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chefri;
    private javax.swing.JButton Dechefri;
    private javax.swing.JEditorPane TextDec;
    private javax.swing.JEditorPane TexteCry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField key;
    private javax.swing.JTextField key1;
    private javax.swing.JEditorPane textC;
    // End of variables declaration//GEN-END:variables
}