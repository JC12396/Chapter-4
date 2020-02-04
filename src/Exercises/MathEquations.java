package Exercises;
import java.lang.Math;
public class MathEquations
{
    private double sine;
    private double cosine;
    private double floor;
    private double ceiling;
    private double round;
    private double sqrt;
    private int small;
    private int large;
    private int rand;

    public MathEquations(double sqrtRt, double cos, double sin, double flor, double ceil, double rond, int larg, int smal, int rnd)
    {
        sqrt = sqrtRt;
        cosine = cos;
        sine = sin;
        floor = flor;
        ceiling = ceil;
        round = rond;
        large = larg;
        small = smal;
        rand = rnd;
    }
    public void display()
    {
        System.out.print(sine + "\n" +cosine + "\n" +floor+ "\n" +ceiling+ "\n" +round+ "\n" +sqrt+ "\n" +small+ "\n" +large+ "\n" +rand);
    }

}