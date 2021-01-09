import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food Klasse: Essen "Äpfel" die, die Schlangen(Player) essen können um Punkte zu erhalten
 * 
 * @Luca Kiefer
 * @V3 - 09.01.2021
 */
public class Food extends Actor
{
    int r, g, b;
    int count = 0;
    
    /**
     * Konstrukutor für Food
     * 
     */
    public Food(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        count();
        
    }
    
    /**
     * 
     * 
     */
    public void count()
    {
        count++;
        if(count > 400)
        getWorld().removeObject(this);
        else if (isTouching(Player.class))
        getWorld().removeObject(this);
    }
}
