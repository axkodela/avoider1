import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderDead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderDead extends World
{

    /**
     * Constructor for objects of class AvoiderDead.
     * 
     */
    public AvoiderDead()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act(){        
        if (Greenfoot.mouseClicked(this)){
            MyWorld mx=new MyWorld();
            Greenfoot.setWorld(mx);
        }
    }
    
    public void setscore(int n){
        showText("Score: "+n,100,300);
    }
    
}
