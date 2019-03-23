package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    private void getInput()
    {

        System.out.println(" What day of week is it ? ");
        String day = myScanner.nextLine();

        System.out.println(" How long to need to stay/ park your vehicle ? ");
        int stayDuration = Integer.parseInt(myScanner.nextLine());

        System.out.println(" Where do you want to park your vehicle ? ");
        String position = myScanner.nextLine();

        calculateAmount(day,stayDuration,position);

    }

    private void calculateAmount(String day, int stayDuration, String position)
    {
        int cost;
        int hourlyRate = 0;
        int multiplier = 0;

        switch (position)
        {
            case "Staff" :
                multiplier = 2;
                break;
            case "Student" :
                multiplier = 1;
                break;
            case "Visitor" :
                multiplier = 3;
                break;
            default :
                System.out.println(" Invalid Input. Aborting. Please try again!");
                getInput();
        }

        switch (day)
        {
            case "Monday" :
                hourlyRate = 2 ;
                break;
            case "Tuesday" :
                hourlyRate = 2 ;
                break;
            case "Wednesday" :
                hourlyRate = 3 ;
                break;
            case "Thursday" :
                hourlyRate = 2 ;
                break;
            case "Friday" :
                hourlyRate = 3 ;
                break;
            case "Saturday" :
                hourlyRate = 4 ;
                break;
            case "Sunday" :
                hourlyRate = 5;
                break;
            default :
                System.out.println(" Invalid Input. Aborting. Please try again!");
                getInput();
        }

        cost = (hourlyRate * multiplier) * stayDuration ;

        System.out.println(" Thanks for parking @ Gateshead College. Please pay : " + cost);

    }

    public static void main(String[] args)
    {

        parking p = new parking();
        p.getInput();

    }

}