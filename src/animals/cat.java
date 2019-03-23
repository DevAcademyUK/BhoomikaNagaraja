package animals;

public class cat {

    String name;
    int age;
    String originCountry;
    String eyeColour;

    public cat(String Name, int Age, String OriginCountry, String EyeColour)
    {
        this.name = Name;
        this.age = Age;
        this.originCountry = OriginCountry;
        this.eyeColour = EyeColour;
    }

    public void catActions(int age, String eyeColour)
    {

        switch(eyeColour)
        {
        case "blue" :
                 System.out.println("Alas! I may not flew you up.");
                 System.out.println("Let me sniff your face.");
                 break;
        case "yellow" :
            System.out.println("I purr when i am happy,keep me so.");
            System.out.println("Else dont make me scratch.");
            break;
        case "green" :
            System.out.println("I loaf around everywhere for food.");
            System.out.println("Better keep me out. ");
        break;
        default :
        System.out.println("I love milk & sleep always.");
        System.out.println("Untill you make me busy. And yeah be careful with my paws.");
            break;
        }
    }

    public String catDetails(String name, int age, String originCountry, String eyeColour){
        return "Heya World! I am " + name + " and i have " + eyeColour + " coloured eyes, hope so not too scary "
                + " and i come from " + originCountry ;
    }

}
