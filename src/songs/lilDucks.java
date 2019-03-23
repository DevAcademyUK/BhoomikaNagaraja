package songs;
import java.util.Scanner;

public class lilDucks
{

    public void lilDucks()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Enter how many ducks are going to play over a hill far away ? ");
        int Ducks = myScanner.nextInt();

        String word = "ducks";
        for(int i = Ducks ;i > 0 ; i--) {
            System.out.println(i + " " + word + " " + " went to play over a hill far away");
            System.out.println("Mother Duck said Quack! Quack! Quack! Quack!");

            if (i == 1)
            {
                System.out.println("All " + Ducks + " ducks came swimming back.");
            }
            else
            {
                int newNum = i - 1;
                if (newNum == 1)
                {
                    word = "duck";
                }
                System.out.println("Only " + newNum + " " + word + " came swimming back.");
                System.out.println();
            }
        }

    }

    public static void main(String[] args)
    {
        lilDucks duck = new lilDucks();
        duck.lilDucks();
    }
}

