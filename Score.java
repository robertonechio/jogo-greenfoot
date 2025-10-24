// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Score extends Actor
{
    private int score = 0;

    /**
     * 
     */
    public void act()
    {
        atualizarScore();
    }

    /**
     * 
     */
    public void adicionar(int pontos)
    {
        score = score + pontos;
    }

    /**
     * 
     */
    public void remover(int pontos)
    {
        score = score - pontos;
    }

    /**
     * 
     */
    public void atualizarScore()
    {
        setImage( new GreenfootImage("Pontos: " + score, 24, Color.BLACK, new Color(0, 0, 0, 0)));
    }
}
