import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderStart extends World
{

    /**
     * Constructor for objects of class AvoiderStart.
     * 
     */
    public AvoiderStart()
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
}
