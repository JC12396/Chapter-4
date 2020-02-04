package Exercises;


import java.util.Random;


public class MathTest
{
    public static void main(String[] args)
    {
        Random r = new Random();

        MathEquations math = new MathEquations(Math.sqrt(37), Math.cos(Math.toRadians(300)), Math.sin(Math.toRadians(300)), Math.floor(22.8),
                Math.ceil(22.8), Math.round(22.8), Math.max('D', 71), Math.min('D', 71), (r.nextInt(20) + 1));
        math.display();
    }
}
