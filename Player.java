import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int lifetime;
    
    public void act() 
    {
        // Add your action code here.
        followMouse();
        checkcollide();
    }    
    
    private void followMouse(){
    //makes the Player follow mouse
    MouseInfo mi=Greenfoot.getMouseInfo();
    if (mi!=null){setLocation(mi.getX(),mi.getY());}
    lifetime++;
    World w=getWorld(); 
    w.showText("Score: "+lifetime,100,300);
    }
    
    private void checkcollide(){    
        java.util.List lx=getNeighbours(20,false,Blinker.class);
        if (lx.size()>0){
          MyWorld mx= (MyWorld) getWorld();
          mx.endGame();
        }
    }
}
