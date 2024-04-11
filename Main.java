import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // create a instance of the cat object

        Cat cat1 = new Cat();
        cat1.setCatName("Puss N' Boots");
        cat1.setColor("Orange ");

        System.out.println("Cat 1 name:" + cat1.getCatName());
        System.out.println("cat 1 Color:" + cat1.getCatColor());
        
        
        //create a cat 2 using new constructor
        Cat cat2 = new Cat("Fluffy", "Black", 7.4, "Alley");
        
        System.out.println("Cat 2 name:" + cat2.getCatName());
        System.out.println("cat 2 Color:" + cat2.getCatColor());

        //use the setcasename setter to change fluffy's name
        cat2.setCatName("Felix");
        System.out.println("Cat 2 name:" + cat2.getCatName());
        cat2.setCatBreed("Bengal");
        System.out.println("Cat 2 Breed:" + cat2.getCatBreed());

        
        //test new method

        cat1.displayCatInfo();
        
        System.out.println("Hello world!");

    }
}