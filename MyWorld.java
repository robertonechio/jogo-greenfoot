// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Score score;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
        score =  new  Score();
        addObject(score, 55, 20);
        Tempo tempo =  new  Tempo();
        addObject(tempo, 105, 40);
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        addObject( new  Personagem1(), 300, 203);
        addObject( new  Abelha(), 0, 0);
        addObject( new  Abelha(), 0, 200);
        addObject( new  Abelha(), 0, 400);
        addObject( new  Morango(), Greenfoot.getRandomNumber(599), Greenfoot.getRandomNumber(399));
    }

    /**
     * 
     */
    public Score getScore()
    {
        return score;
    }
}
