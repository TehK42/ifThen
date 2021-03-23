package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien.");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 10;
        if (secondTopScore != 100) {
            System.out.println("You did not get the high score.");
        }

        int thirdTopScore = 200;
        if (thirdTopScore > 100) {
            System.out.println("You got a score higher than 100!");
        }

        int fourthTopScore = 100;
        if (fourthTopScore >= 100) {
            System.out.println("You got a score greater or equal than 100!");
        }

        int fifthTopScore = 10;
        if (fifthTopScore < 100) {
            System.out.println("You got a score less than 100");
        }

        int sixthTopScore = 100;
        if (sixthTopScore <= 100) {
            System.out.println("You got a score less or equal than 100!");
        }

        int firstScore = 80;
        int secondScore = 60;
        if (firstScore > secondScore && firstScore < 100) {
            System.out.println("Greater than Second Top Score and less than 100");
        }

        if ((firstScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both statements are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This should not happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
