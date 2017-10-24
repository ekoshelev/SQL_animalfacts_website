package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16103760
 */
public class Animal {
    private String name;
    private String image;
    private String shortdesc;
    private String longdesc;
    
    public Animal(String name, String image, String shortdesc, String longdesc){
        this.name=name;
        this.image=image;
        this.shortdesc=shortdesc;
        this.longdesc=longdesc;
    }
    
    public String getName(){
        return name;
    }
    
    public String getImage(){
        return image;
    }
    
    public String getShortDesc(){
        return shortdesc;
    }
    
    public String getLongDesc(){
        return longdesc;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setImage(String image){
        this.image=image;
    }
    public void setShortDesc(String shortdesc){
        this.shortdesc=shortdesc;
    }
    public void setLongDesc(String longdesc){
        this.longdesc=longdesc;
    }
}
