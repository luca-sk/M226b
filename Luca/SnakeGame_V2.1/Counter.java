import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Counter Klasse: Zähler an den oberen Ecken
 * 
 * @Luca Kiefer
 * @V3 - 09.01.2021
 */
public class Counter extends Actor
{
    public int score = 0;

    /**
     * Konstrukutor für Player
     * 
     */
    public Counter ()
    {
        setImage(new GreenfootImage("Score:" + score, 20, Color.BLACK, Color.WHITE));
        youWin();
    }

    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        score();

    }
    
    /**
     * Score Bild
     * 
     */
    public void score()
    {
        setImage(new GreenfootImage("Score:" + score, 20, Color.BLACK, Color.WHITE));
    }
    
    /**
     * Score + 1 
     * wird in Player ausgeführt
     * 
     */
    public void addScore()
    {
        score++;
    }

    /**
     * wenn Punktstand 10 dann wird Klasse YouWin in die mitte gezeigt
     * und Greenfoot wird gestoppt
     */
    public void youWin()
    {
        if(score == 10){
            getWorld().addObject(new YouWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
