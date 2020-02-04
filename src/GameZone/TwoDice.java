package GameZone;

import java.util.Random;

public class TwoDice
{
    public static void main(String[] args)
    {
        DieInfo dieValue = new DieInfo();
        Random rand = new Random();

        dieValue.setDie1(rand.nextInt(6) + 1);

        dieValue.setDie2(rand.nextInt(6) + 1);
        if(dieValue.getDie1() > dieValue.getDie2())
        {
            System.out.println("Your Die - " + dieValue.getDie1() + "\nTheir Die - " + dieValue.getDie2() + "\nYou win! :)");
        }
        else{
            System.out.println("Your Die - " + dieValue.getDie1() + "\nTheir Die - " + dieValue.getDie2() + "\nYou Lost. :(");
        }


    }
}