package animals;

public class dog
{
    String Name;
    int Age;
    String Breed;
    String Size;

    public dog(String name, String breed, String size, int age)
    {
        this.Age = age;
        this.Breed = breed;
        this.Size = size;
        this.Name = name;
    }

    String barkSounds(String Size)
    {
        String bark = "";
        if(Size.equalsIgnoreCase("small"))
            bark = " yap yap yap ";
        else if(Size.equalsIgnoreCase("medium"))
            bark = " woof woof ";
        else
            bark = " WOOF! WOOF!";
        return bark;
    }

    String playActivity(String Breed)
    {
        String play = "";
        if(Breed.equalsIgnoreCase("poodle"))
            play = "oh! Dear, I don't think so, no one could not possibly engage in such activities";
        else if (Breed.equalsIgnoreCase("Labrador"))
            play = "Yeah, Yeah, throw the stick! Yeah, DO IT!";
        else if(Breed.equalsIgnoreCase("Border Collie"))
            play = "Lets go chase us some sheep!";
        else
            play = "Come lets go to walk in park.";
        return play;
    }

    String beHuman(String name, int age, String breed)
    {
        return "Hello Human, I am " + name + " and I am " + age + " years old " + breed + ", What breed are you ?";
    }

}
