package loops;

import java.util.Scanner;

public class multiply {

    public static void main(String[] args) {
        multiply m = new multiply();
        m.getValue();
    }

    Scanner myScan = new Scanner(System.in);

    private void getValue()
    {
        System.out.println(" Enter the value to create a multiplication table for : ");
        int num = Integer.parseInt(myScan.nextLine());

        System.out.println(" what is the maximum number of multilpcation table you want to create : ");
        int max = Integer.parseInt(myScan.nextLine());

        calc(num,max);
    }
    private void calc(int num, int max)
    {
        System.out.println(" The multiplication table for number " + num + " is as follows : ");

        for (int i = 1; i <= max; i++) {
            int mult = (i * num);
            System.out.println(num + " * " + i + " is "+ mult);
        }

    }
}
