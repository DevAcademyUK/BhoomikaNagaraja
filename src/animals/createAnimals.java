package animals;

import java.util.Scanner;

public class createAnimals
{

    Scanner myScanner = new Scanner(System.in);

    private void getAnimalType()
    {

        System.out.println("What animal would you like to create ?");
        String animal = myScanner.nextLine();

        if(animal.equalsIgnoreCase( "dog"))
        {
            createDog();
        }
        else if(animal.equalsIgnoreCase(  "cat"))
        {
            createCat();
        }
        else
            System.out.println(animal +" is not an animal. So please try again.");
    }

    private void createCat() {

        System.out.println("What is the cats name ?");
        String name = myScanner.nextLine();

        System.out.println("How old is the cat ?");
        int age = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is the cats origin country ?");
        String originCountry = myScanner.nextLine();

        System.out.println("What is the cats eye colour ?");
        String eyeColour = myScanner.nextLine();

        cat myCat = new cat(name, age, originCountry, eyeColour);

        myCat.catActions(age,eyeColour);

        String catmsg = myCat.catDetails(name,age,originCountry,eyeColour);
        System.out.println(catmsg);

        getAnimalType();
    }

    private void createDog()
    {

        System.out.println("What is the dog's name ?");
        String Name = myScanner.nextLine();

        System.out.println("How big is the dog ?");
        String Size = myScanner.nextLine();

        System.out.println("What is the dog's age ?");
        int Age = Integer.parseInt(myScanner.nextLine());

        System.out.println("What breed is the dog ?");
        String Breed = myScanner.nextLine();

        dog myDog =  new dog(Name,Breed,Size,Age);

        System.out.println("I " + myDog.barkSounds(Size));

        String dogActivity = myDog.playActivity(Breed);
        System.out.println("My Activity " + dogActivity);

        String dogDetails = myDog.beHuman(Name,Age,Breed);
        System.out.println("My details are " + dogDetails);

        getAnimalType();

    }

    public static void main (String[]args)
    {
        createAnimals myAnimal = new createAnimals();
        myAnimal.getAnimalType();
    }
}
