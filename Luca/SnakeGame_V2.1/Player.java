import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player Klasse: die 2 Schlangen
 * 
 * @Luca Kiefer
 * @V3 - 09.01.2021
 */
public class Player extends Actor
{
    
    int r , g, b, player;
    int speed = 3;
    int count = 0;
    
    /**
     * Konstrukutor für Player
     * 
     */
    public Player(int player, int r, int g, int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        this.player = player;
        getImage().setColor(new Color(r, g, b));
        getImage().fillRect(0,0,40,40);
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(),getY());
        move(speed);
        moveAround();
        eatFood();
        
    }
    
    /**
     * Bewegung der 2 Schlagen
     * 
     * 0 = Blaue Schlange
     * 4 = Grüne Schlange
     * 
     */
    public void moveAround()
    {
        if(this.player == 0){
            if(Greenfoot.isKeyDown("right"))
                setRotation(0);
            if(Greenfoot.isKeyDown("left"))
                setRotation(180);
            if(Greenfoot.isKeyDown("up"))
                setRotation(270);
            if(Greenfoot.isKeyDown("down"))
                setRotation(90);
        }
        if(this.player == 4){
            if(Greenfoot.isKeyDown("d"))
                setRotation(0);
            if(Greenfoot.isKeyDown("a"))
                setRotation(180);
            if(Greenfoot.isKeyDown("w"))
                setRotation(270);
            if(Greenfoot.isKeyDown("s"))
                setRotation(90);
        }
    }
    
    /**
     *  Geht zu blueCounter & greenCounter von MyWorld und führt addScore aus wenn Player Food berührt
     * 
     */
    public void eatFood()
    {
        if(isTouching(Food.class) && player == 0)
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.blueCounter.addScore();
            
        }
        if(isTouching(Food.class) && player == 4)
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.greenCounter.addScore();
            
        }
    }
   
}
