import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("ahhhhhhhhhhhhhhhhh.wav");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant()
    {
        for(int i = 0; i < 8; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    /** 
     * Animate Elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        // Remove apple if touched
        eat();
        
        // Animate elephant
        animateElephant();
    }
    
    /**
     * Spawns new apple when eaten.
     */
    public void eat()
        {
            if(isTouching(Apple.class))
            {
                removeTouching(Apple.class);
                MyWorld world = (MyWorld) getWorld();
                world.createApple();
                world.increaseScore();
                elephantSound.play();
            }
        }
}
