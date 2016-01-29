import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    int counter = 0;
    Player player = new Player();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        addObject(player,79,93);
    }
    
    public void act(){
         addenemies();
        }
        
        
    private void addenemies(){
    
        if (counter>50){
        int randx=Greenfoot.getRandomNumber(getWidth());
            Blinker pdot=new Blinker();
            addObject(pdot,randx,0);
            counter=0;

        }
        else{ counter++;}
    }
    
    public void endGame(){
        AvoiderDead aw=new AvoiderDead();
        Greenfoot.setWorld(aw);
        aw.setscore(player.lifetime);
    }
    

}
