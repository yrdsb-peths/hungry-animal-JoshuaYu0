import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        // Elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
        
        // Label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        // Apple Object
        createApple();
    }
    
    /**
     * End the game with Game Over text.
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase Score when and apple is eaten.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * Ramdomize apple spawn location.
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
