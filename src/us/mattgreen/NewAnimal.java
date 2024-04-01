package us.mattgreen;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class NewAnimal {
//    Ask the user what type of animal they want to create
//    Accept the input(s) necessary to instantiate that type of object
//    Create an object of that type
//   ***Add the object to the ArrayList - Still have to add to ArrayList***

    private final Scanner input = new Scanner(System.in);

    //    Ask the user what type of animal they want to create

    public Talkable getNewAnimalType() {
        System.out.println("What kind of animal do you want to add?");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Teacher");

        String animalType = input.nextLine();
        if (Objects.equals(animalType, "1")) {
           return newCat();
        } else if (Objects.equals(animalType, "2")) {
            return newDog();
        } else if (Objects.equals(animalType, "3")) {
            return newTeacher();
        } else {
            System.out.println("Please choose from selections");
        }
        return null;
    }


    //    Accept the input(s) necessary to instantiate that type of object
    //    Create an object of that type

    public Cat newCat() {
        System.out.println("What is the name of your cat?");
        String name = input.nextLine();
        System.out.println("How many mice has your cat killed?");
        int numOfMiceKilled = Integer.parseInt(input.nextLine());
        return new Cat(numOfMiceKilled, name);
    }

    public Dog newDog() {
        System.out.println("What is the name of your dog?");
        String name = input.nextLine();
        System.out.println("Dog is friendly? true or false?");

        boolean isDogFriendly = input.nextBoolean();
        if (isDogFriendly) {
            return new Dog(true, name);
        } else if (!isDogFriendly) {
            return new Dog(false, name);
        } else {
            return null;
        }

    }

    public Teacher newTeacher() {
        System.out.println("What is the name of your Teacher?");
        String name = input.nextLine();
        System.out.println("How old is your teacher?");
        int teacherAge = Integer.parseInt(input.nextLine());
        return new Teacher(teacherAge, name);
    }


}
