/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package friendadder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sam
 */
public class ImagePanel extends javax.swing.JPanel {
    private String picture;
    /**
     * Creates new form ImagePanel
     */
    public ImagePanel() {
        this.picture=FirstTimeSetup.getPicturesPath()+"blank.png";
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

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //User chooses picture for selected friend
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Select a JPEG, PNG, or GIF file.", "jpg", "png", "gif");
        chooser.setFileFilter(filter);
        int retval=chooser.showOpenDialog(this);
        if(retval==JFileChooser.APPROVE_OPTION){
            File picture=chooser.getSelectedFile();
            BufferedImage image;
            try {
                image = ImageIO.read(picture);
                if(image.getHeight()==256&&image.getWidth()==256){
                    File file=new File(FirstTimeSetup.getPicturesPath()+picture.getName()/*+".png"*/);
                    ImageIO.write(image, "png", file);
                    this.setPicture(file.getPath());
                }
                else{
                    Image scaled=image.getScaledInstance(256, 256, 0);
                    //Convert Image to BufferedImage or RenderedImage
                    BufferedImage scaledImage=new BufferedImage(256, 256, BufferedImage.TYPE_INT_RGB);
                    Graphics g=scaledImage.createGraphics();
                    g.drawImage(scaled, 0, 0, null);
                    File f=new File(FirstTimeSetup.getPicturesPath()+picture.getName()/*+".png"*/);
                    ImageIO.write(scaledImage, "png", f);
                    this.setPicture(f.getPath());
                }  
            } catch (IOException ex) {
                Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
    }//GEN-LAST:event_formMousePressed
    
    //Gets blank image
    public String getBlank() throws IOException{
        return FirstTimeSetup.getPicturesPath()+"blank.png";
    }
    
    //Gets selected image
    public String getPicture() throws IOException{
        return this.picture;
    }
    
    //Sets picture to selected image
    public void setPicture(String name) throws IOException{
        BufferedImage i=ImageIO.read(new File(name));
        this.picture=name;
        Graphics g=i.getGraphics();
        this.paintComponent(g);
        this.update(g);
        System.out.println("Updated");
    }
    
    //Draws the image
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage i;
        try {
            i = ImageIO.read(new File(this.picture));
            g.drawImage(i, 0, 0, 255, 255, 0, 0, i.getWidth(), i.getHeight(), null);
            
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
