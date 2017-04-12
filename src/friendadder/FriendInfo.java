/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package friendadder;

import java.awt.Graphics;
import java.io.IOException;

/**
 *
 * @author Sam
 */
public class FriendInfo extends javax.swing.JPanel {
    /**
     * Creates new form FriendInfo
     */
    public FriendInfo() {
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

        imagePanel1 = new friendadder.ImagePanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        basicInfoPanel1 = new friendadder.BasicInfoPanel();
        appearancePanel1 = new friendadder.AppearancePanel();
        favoritesPanel1 = new friendadder.FavoritesPanel();

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Basic Info", basicInfoPanel1);
        basicInfoPanel1.getAccessibleContext().setAccessibleName("");
        basicInfoPanel1.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Appearance", appearancePanel1);
        jTabbedPane1.addTab("Favorites", favoritesPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Fills text fields with data from friend
    public void processFriend(Friend f) throws IOException{
        basicInfoPanel1.setFName(f.getName());
        basicInfoPanel1.setGender(f.getGender());
        basicInfoPanel1.setAge(f.getAge());
        basicInfoPanel1.setBirthday(f.getBirthDay());
        basicInfoPanel1.setBirthMonth(f.getBirthMonth());
        basicInfoPanel1.setBirthYear(f.getBirthYear());
        basicInfoPanel1.setConnection(f.getConnection());
        basicInfoPanel1.setRelationshipStatus(f.getRelationshipStatus());
        basicInfoPanel1.setGetAlong(f.getGetAlong());
        appearancePanel1.setHairLength(f.getHairLength());
        appearancePanel1.setHairColor(f.getHairColor());
        appearancePanel1.setEyeColor(f.getEyeColor());
        appearancePanel1.setWearsGlasses(f.getWearsGlasses());
        appearancePanel1.setWearsEarrings(f.getWearsEarrings());
        appearancePanel1.setDressUpStyle(f.getDressUpStyle());
        appearancePanel1.setShoeType(f.getShoeType());
        appearancePanel1.setFHeight(f.getHeight());
        appearancePanel1.setSkinTone(f.getSkinTone());
        favoritesPanel1.setFavMusic(f.getFavMusic());
        favoritesPanel1.setFavRestaurants(f.getFavRestaurants());
        favoritesPanel1.setFavVideoGames(f.getFavVideoGames());
        favoritesPanel1.setFavNonVideoGames(f.getFavNonVideoGames());
        favoritesPanel1.setFavMovies(f.getFavMovies());
        favoritesPanel1.setFavShows(f.getFavShows());
        favoritesPanel1.setFavBooks(f.getFavBooks());
        favoritesPanel1.setFavHobbies(f.getFavHobbies());
        favoritesPanel1.setFavSports(f.getFavSports());
        favoritesPanel1.setFavPeople(f.getFavPeople());
        favoritesPanel1.setFavFoods(f.getFavFoods());
        favoritesPanel1.setFavClothesBrand(f.getFavClothesBrand());
        favoritesPanel1.setFavAnimals(f.getFavAnimals());
        favoritesPanel1.setFavTraditions(f.getFavTraditions());
        imagePanel1.setPicture(f.getPicture());
        this.update();
    }
    
    //edits friend data
    public void editFriend(Friend f) throws IOException{
        f.setName(basicInfoPanel1.getFName());
        f.setGender(basicInfoPanel1.getGender());
        f.setAge(basicInfoPanel1.getAge());
        f.setBirthDay(basicInfoPanel1.getBirthday());
        f.setBirthMonth(basicInfoPanel1.getBirthMonth());
        f.setBirthYear(basicInfoPanel1.getBirthYear());
        f.setConnection(basicInfoPanel1.getConnection());
        f.setRelationshipStatus(basicInfoPanel1.getRelationshipStatus());
        f.setGetAlong(basicInfoPanel1.getGetAlong());
        f.setHairLength(appearancePanel1.getHairLength());
        f.setHairColor(appearancePanel1.getHairColor());
        f.setEyeColor(appearancePanel1.getEyeColor());
        f.setWearsGlasses(appearancePanel1.getWearsGlasses());
        f.setWearsEarrings(appearancePanel1.getWearsEarrings());
        f.setDressUpStyle(appearancePanel1.getDressUpStyle());
        f.setShoeType(appearancePanel1.getShoeType());
        f.setHeight(appearancePanel1.getFHeight());
        f.setSkinTone(appearancePanel1.getSkinTone());
        f.setFavMusic(favoritesPanel1.getFavMusic());
        f.setFavRestaurants(favoritesPanel1.getFavRestaurants());
        f.setFavVideoGames(favoritesPanel1.getFavVideoGames());
        f.setFavNonVideoGames(favoritesPanel1.getFavNonVideoGames());
        f.setFavMovies(favoritesPanel1.getFavMovies());
        f.setFavShows(favoritesPanel1.getFavShows());
        f.setFavBooks(favoritesPanel1.getFavBooks());
        f.setFavHobbies(favoritesPanel1.getFavHobbies());
        f.setFavSports(favoritesPanel1.getFavSports());
        f.setFavPeople(favoritesPanel1.getFavPeople());
        f.setFavFoods(favoritesPanel1.getFavFoods());
        f.setFavClothesBrand(favoritesPanel1.getFavClothesBrand());
        f.setFavAnimals(favoritesPanel1.getFavAnimals());
        f.setFavTraditions(favoritesPanel1.getFavTraditions());
        f.setPicture(imagePanel1.getPicture());
        
    }
    
    //updates image
    public void update(){
        Graphics g=this.getGraphics();
        this.update(g);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private friendadder.AppearancePanel appearancePanel1;
    private friendadder.BasicInfoPanel basicInfoPanel1;
    private friendadder.FavoritesPanel favoritesPanel1;
    private friendadder.ImagePanel imagePanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}