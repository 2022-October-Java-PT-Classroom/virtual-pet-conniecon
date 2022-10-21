package virtual_pet;

import java.util.Random;

public class VirtualPet {
    Random rand = new Random();

    // Instance Variables
    private int hungerLevel;
    private int thirstLevel;
    private int sleepLevel;
    private int boredomLevel;

    // Constructor - builds object, assigns properties
    public VirtualPet(int hungerLevel, int thirstLevel, int sleepLevel, int boredomLevel) {
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sleepLevel = sleepLevel;
        this.boredomLevel = boredomLevel;
    }

    // Getters return the instance data you prefer public
    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getSleepLevel() {
        return sleepLevel;
    }

    public int getBoredomLevel(){
        return boredomLevel;
    }

    public void feed() {
        hungerLevel += 5;
        thirstLevel -= 4;
        sleepLevel += 2;
        boredomLevel += 5;
    }

    public void thirst() {
        hungerLevel -= 3;
        thirstLevel += 6;
        sleepLevel -= 1;
        boredomLevel += 4;
    }

    public void sleep() {
        hungerLevel -= 5;
        thirstLevel -= 4;
        sleepLevel += 2;
        boredomLevel -= 1;
    }


        public void tick () {
            int min = -5;
            int max = 5;
            int randomChoice = min + rand.nextInt(max);
            hungerLevel += randomChoice;
            thirstLevel += randomChoice;
            sleepLevel += randomChoice;
        }


    }



