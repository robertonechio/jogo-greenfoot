// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Ponto here.
 */
public class TextoTemporario extends Actor
{
    /* Instance variables - replace the example below with your own*/
    private int tempoRestante = 90;
    private int opacidade = 255;
    private GreenfootImage imagemBase;

    /**
     * Constructor for objects of class Ponto
     */
    public TextoTemporario(String texto, Color cor)
    {
        imagemBase =  new GreenfootImage(texto, 28, cor, new Color(0, 0, 0, 0));
        setImage(imagemBase);
    }

    /**
     * 
     */
    public void act()
    {
        tempoRestante = tempoRestante - 1;
        /* Faz o texto desaparecer aos poucos (fade-out)*/
        if (tempoRestante < 60) {
            /* últimos 60 frames (~1 segundo)*/
            opacidade = (int)(255 * (tempoRestante / 60.0));
            getImage().setTransparency(Math.max(0, opacidade));
        }
        /* Quando o tempo acabar, remove o texto*/
        MyWorld world = (MyWorld)getWorld();
        if (tempoRestante <= 0) {
            getWorld().removeObject(this);
        }
    }
}
