/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author INSTRUCTOR
 */
public class Card extends javax.swing.JPanel {

    /**
     * Creates new form Card
     */
    public Card(Digimon digi) {

        System.out.println(digi.getHref());
        initComponents();
        initAlter(digi);

    }

    public void initAlter(Digimon digi) {
        String url = digi.getImage();
        URL imgURL;
        try {
            imgURL = new URL(url);
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image escalado = img.getScaledInstance(213, 171, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(escalado);
            etqCardImagen.setIcon(icon);
            etqNombre.setText(digi.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqNombre = new javax.swing.JLabel();
        etqCardImagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(100, 100));

        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Digimon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etqCardImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(etqCardImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqCardImagen;
    private javax.swing.JLabel etqNombre;
    // End of variables declaration//GEN-END:variables
}
