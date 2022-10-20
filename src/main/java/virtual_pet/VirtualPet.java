package virtual_pet;

import java.util.Random;

public class VirtualPet {
    Random rand = new Random();

    // Instance Variables
    private int hungerLevel;
    private int thirstLevel;
    private int sleepLevel;

    // Constructor - builds object, assigns properties
    public VirtualPet(int hungerLevel, int thirstLevel, int sleepLevel) {
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sleepLevel = sleepLevel;
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

//    public void setHungerLevel(int hungerLevel) {
//        this.hungerLevel = hungerLevel;
//    }
//
//    public void setThirstLevel(int thirstLevel) {
//        this.thirstLevel = thirstLevel;
//    }
//
//    public void setSleepLevel(int sleepLevel) {
//        this.sleepLevel = sleepLevel;
//    }


    public void feed() {
        hungerLevel += 5;
        thirstLevel += 4;
        sleepLevel -= 2;
    }

    public void thirst() {
        hungerLevel -= 3;
        thirstLevel += 6;
        sleepLevel -= 1;
    }

    public void sleep() {
        hungerLevel += 5;
        thirstLevel += 4;
        sleepLevel -= 2;
    }


    public void tick() {
        hungerLevel += 2;
        thirstLevel -= 1;
        sleepLevel += 2;


//        public int tick () {
//            int min = -5;
//            int max = 5;
//            int randomChoice = min + rand.nextInt(max);
//            return hungerLevel += randomChoice;
//            thirstLevel = randomChoice;
//            sleepLevel = randomChoice;
//        }


    }


}
