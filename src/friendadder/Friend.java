/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package friendadder;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 *
 * @author Sam
 */

//Friend class
public class Friend {
    
    //Basic details about friend
    
    private String name;
    private String gender;
    private int age;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String connection;
    private String relationshipStatus;
    private String getAlong;
    
    private String hairLength; //Buzz, Short, Mid, Long
    private String hairColor;
    private String eyeColor;
    private boolean wearsGlasses;
    private boolean wearsEarrings;   
    private String dressUpStyle; //Informal, Casual, Semiformal, Formal
    private String shoeType; //Casual, Formal, Sports
    private String height; //Short, Mid, Tall
    private String skinTone; //Light, Mid, Dark
    
    private String favMusic;
    private String favRestaurants;
    private String favVideoGames;
    private String favNonVideoGames;
    private String favMovies;
    private String favShows;
    private String favBooks;
    private String favHobbies;
    private String favSports;
    private String favPeople;
    private String favFoods;
    private String favClothesBrand;
    private String favAnimal;
    private String favTradition;
    
    private String picture;
    
    //Constructor
    public Friend(String name){
        this.name=name;
        this.gender="";
        this.age=0;
        this.birthDay=0;
        this.birthMonth=0;
        this.birthYear=0;
        this.connection="";
        this.relationshipStatus="";
        this.getAlong="";
        this.hairLength="";
        this.hairColor="";
        this.eyeColor="";
        this.wearsGlasses=false;
        this.wearsEarrings=false;
        this.dressUpStyle="";
        this.shoeType="";
        this.height="";
        this.skinTone="";
        this.favMusic="";
        this.favRestaurants="";
        this.favVideoGames="";
        this.favNonVideoGames="";
        this.favMovies="";
        this.favShows="";
        this.favBooks="";
        this.favHobbies="";
        this.favSports="";
        this.favPeople="";
        this.favFoods="";
        this.favClothesBrand="";
        this.favAnimal="";
        this.favTradition="";
        this.picture="blank.png";
        
    }
    
    //Argument constructor for the sake of argument constructor
    public Friend(String name, String gender, int age, int birthDay, int birthMonth, int birthYear,
            String connection, String relationshipStatus, String getAlong,
            String residenceCity, String residenceState, String residenceCountry,
            String hairLength, String hairColor, String eyeColor, boolean wearsGlasses, boolean wearsEarrings,
            String dressUpStyle, String shoeType, String height, String skinTone,
            String favMusic, String favRestaurants, String favVideoGames, String favNonVideoGames, String favMovies,
            String favShows, String favBooks, String favHobbies, String favSports, String favPeople, String favFoods,
            String favClothesBrand, String favAnimal, String favTradition,
            String picture){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.birthDay=birthDay;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
        this.connection=connection;
        this.relationshipStatus=relationshipStatus;
        this.getAlong=getAlong;
        this.hairLength=hairLength;
        this.hairColor=hairColor;
        this.eyeColor=eyeColor;
        this.wearsGlasses=wearsGlasses;
        this.wearsEarrings=wearsEarrings;
        this.dressUpStyle=dressUpStyle;
        this.shoeType=shoeType;
        this.height=height;
        this.skinTone=skinTone;
        this.favMusic=favMusic;
        this.favRestaurants=favRestaurants;
        this.favVideoGames=favVideoGames;
        this.favNonVideoGames=favNonVideoGames;
        this.favMovies=favMovies;
        this.favShows=favShows;
        this.favBooks=favBooks;
        this.favHobbies=favHobbies;
        this.favSports=favSports;
        this.favPeople=favPeople;
        this.favFoods=favFoods;
        this.favClothesBrand=favClothesBrand;
        this.favAnimal=favAnimal;
        this.favTradition="";
        this.picture=picture;
    }

    //Getters and setters for data fields
    
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String newGender){
        this.gender=newGender;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    public int getBirthDay(){
        return this.birthDay;
    }
    public void setBirthDay(int newBirthDay){
        this.birthDay=newBirthDay;
    }
    public int getBirthMonth(){
        return this.birthMonth;
    }
    public void setBirthMonth(int newBirthMonth){
        this.birthMonth=newBirthMonth;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setBirthYear(int newBirthYear){
        this.birthYear=newBirthYear;
    }
    public String getConnection(){
        return this.connection;
    }
    public void setConnection(String newConnection){
        this.connection=newConnection;
    }
    public String getRelationshipStatus(){
        return this.relationshipStatus;
    }
    public void setRelationshipStatus(String newRelationshipStatus){
        this.relationshipStatus=newRelationshipStatus;
    }
    public String getGetAlong(){
        return this.getAlong;
    }
    public void setGetAlong(String newGetAlong){
        this.getAlong=newGetAlong;
    }
    public String getHairLength(){
        return this.hairLength;
    }
    public void setHairLength(String newHairLength){
        this.hairLength=newHairLength;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String newHairColor){
        this.hairColor=newHairColor;
    }
    public String getEyeColor(){
        return this.eyeColor;
    }
    public void setEyeColor(String newEyeColor){
        this.eyeColor=newEyeColor;
    }
    public boolean getWearsGlasses(){
        return this.wearsGlasses;
    }
    public void setWearsGlasses(boolean newWearsGlasses){
        this.wearsGlasses=newWearsGlasses;
    }
    public boolean getWearsEarrings(){
        return this.wearsEarrings;
    }
    public void setWearsEarrings(boolean newWearsEarrings){
        this.wearsEarrings=newWearsEarrings;
    }
    public String getDressUpStyle(){
        return this.dressUpStyle;
    }
    public void setDressUpStyle(String newDressUpStyle){
        this.dressUpStyle=newDressUpStyle;
    }
    public String getShoeType(){
        return this.shoeType;
    }
    public void setShoeType(String newShoeType){
        this.shoeType=newShoeType;
    }
    public String getHeight(){
        return this.height;
    }
    public void setHeight(String newHeight){
        this.height=newHeight;
    }
    public String getSkinTone(){
        return this.skinTone;
    }
    public void setSkinTone(String newSkinTone){
        this.skinTone=newSkinTone;
    }
    public String getFavMusic(){
        return this.favMusic;
    }
    public void setFavMusic(String newFavMusic){
        this.favMusic=newFavMusic;
    }
    public String getFavRestaurants(){
        return this.favRestaurants;
    }
    public void setFavRestaurants(String newFavRestaurants){
        this.favRestaurants=newFavRestaurants;
    }
    public String getFavVideoGames(){
        return this.favVideoGames;
    }
    public void setFavVideoGames(String newFavVideoGames){
        this.favVideoGames=newFavVideoGames;
    }
    public String getFavNonVideoGames(){
        return this.favNonVideoGames;
    }
    public void setFavNonVideoGames(String newFavNonVideoGames){
        this.favNonVideoGames=newFavNonVideoGames;
    }
    public String getFavMovies(){
        return this.favMovies;
    }
    public void setFavMovies(String newFavMovies){
        this.favMovies=newFavMovies;
    }
    public String getFavShows(){
        return this.favShows;
    }
    public void setFavShows(String newFavShows){
        this.favShows=newFavShows;
    }
    public String getFavBooks(){
        return this.favBooks;
    }
    public void setFavBooks(String newFavBooks){
        this.favBooks=newFavBooks;
    }
    public String getFavHobbies(){
        return this.favHobbies;
    }
    public void setFavHobbies(String newFavHobbies){
        this.favHobbies=newFavHobbies;
    }
    public String getFavSports(){
        return this.favSports;
    }
    public void setFavSports(String newFavSports){
        this.favSports=newFavSports;
    }
    public String getFavPeople(){
        return this.favPeople;
    }
    public void setFavPeople(String newFavPeople){
        this.favPeople=newFavPeople;
    }
    public String getFavFoods(){
        return this.favFoods;
    }
    public void setFavFoods(String newFavFoods){
        this.favFoods=newFavFoods;
    }
    public String getFavClothesBrand(){
        return this.favClothesBrand;
    }
    public void setFavClothesBrand(String newFavClothesBrand){
        this.favClothesBrand=newFavClothesBrand;
    }
    public String getFavAnimals(){
        return this.favAnimal;
    }
    public void setFavAnimals(String newFavAnimal){
        this.favAnimal=newFavAnimal;
    }
    public String getFavTraditions(){
        return this.favTradition;
    }
    public void setFavTraditions(String newFavTradition){
        this.favTradition=newFavTradition;
    }
    public String getPicture(){
        return this.picture;
    }
    public void setPicture(String newPicture){
        this.picture=newPicture;
    }
}
