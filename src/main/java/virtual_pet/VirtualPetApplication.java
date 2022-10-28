package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet(50, 20, 30,70);


        System.out.println("LARRY");
        System.out.println("-------------");
        System.out.println("Hunger: " + myVirtualPet.getHungerLevel());
        System.out.println("Thirst: " + myVirtualPet.getThirstLevel());
        System.out.println("Sleep: " + myVirtualPet.getSleepLevel());
        System.out.println("Boredom: " + myVirtualPet.getBoredomLevel());

        System.out.println("");

        System.out.println("What do you want to do?");
        System.out.println("1. Feed Larry");
        System.out.println("2. Water Larry");
        System.out.println("3. Give Larry a nap");
        System.out.println("4. Play with Larry");
        System.out.println("5. End Game");

        int userChoice = input.nextInt();


        while (userChoice != 5) {
            if (userChoice == 1) {
                myVirtualPet.feed();

                System.out.println("");
                System.out.println("Larry is eating");

                displayLevels(myVirtualPet);

            } else if (userChoice == 2) {
                myVirtualPet.thirst();

                System.out.println("");
                System.out.println("Larry is drinking");

                displayLevels(myVirtualPet);

            } else if (userChoice == 3) {
                myVirtualPet.sleep();

                System.out.println("");
                System.out.println("Larry is napping");

                displayLevels(myVirtualPet);

            } else if (userChoice == 4) {
                myVirtualPet.tick();

                System.out.println("");
                System.out.println("Larry is playing");

                displayLevels(myVirtualPet);
            }

                System.out.println("What do you want to do?");
                System.out.println("1. Feed Larry");
                System.out.println("2. Water Larry");
                System.out.println("3. Give Larry a nap");
                System.out.println("4. End Game");
                userChoice = input.nextInt();


            }
            System.out.println("Game Over");

        }

        public static void displayLevels(VirtualPet myVirtualPet){
            System.out.println("These are the new levels");
            System.out.println("Hunger: " + myVirtualPet.getHungerLevel());
            System.out.println("Thirst: " + myVirtualPet.getThirstLevel());
            System.out.println("Sleep: " + myVirtualPet.getSleepLevel());
            System.out.println("Boredom: " + myVirtualPet.getBoredomLevel());
        }
    }

