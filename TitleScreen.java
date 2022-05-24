import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @Joshua
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop.
     */
    public void act()
    {
        // Start game if user presses space.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,524,52);
        elephant.setLocation(300,343);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,254,124);
        label.setLocation(391,264);
        label.setLocation(317,130);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,254,186);
        label2.setLocation(334,191);
        label2.setLocation(326,244);
        label.setLocation(329,191);
        label.setLocation(314,154);
        label2.setLocation(319,207);
        label.setLocation(294,100);
        label2.setLocation(422,132);
        removeObject(label2);
        Label label3 = new Label("Use <-- and --> to Move", 45);
        addObject(label3,264,145);
        label3.setLocation(308,267);
    }
}
