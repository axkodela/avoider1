import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blinker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blinker extends Actor
{
    /**
     * Act - do whatever the Blinker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+1);
        checkremove();
        // Add your action code here.
    }    
    
    private void checkremove(){
        World w=getWorld();
        if (getY()>w.getHeight()){w.removeObject(this); }
    }
}
