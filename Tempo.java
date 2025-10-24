// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Tempo extends Actor
{
    private int tempo = 3000;
    private int escala = 1;

    /**
     * 
     */
    public void act()
    {
        atualizarTempo();
    }

    /**
     * 
     */
    public void atualizarTempo()
    {
        setImage( new  GreenfootImage("Tempo restante: " + tempo / 100 + "s", 24, Color.BLACK,  new  Color(0, 0, 0, 0)));
        tempo = tempo - 1;
        if (tempo <= 0) {
            Greenfoot.stop();
        }
    }
}
