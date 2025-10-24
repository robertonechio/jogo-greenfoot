// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Personagem1 extends Actor
{

    /**
     * Act - do whatever the Personagem1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 5);
        }
    }
}
