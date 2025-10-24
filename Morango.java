// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Morango extends Actor
{

    /**
     * Act - do whatever the Morango wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Personagem1.class)) {
            getWorld().addObject( new TextoTemporario("+1", Color.GREEN), getX(), getY() - 30);
            setLocation(Greenfoot.getRandomNumber(599), Greenfoot.getRandomNumber(399));
            MyWorld world = (MyWorld)getWorld();
            world.getScore().adicionar(1);
        }
    }
}
