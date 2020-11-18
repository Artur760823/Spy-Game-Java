package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| Hello 0013, as usual you fell into a trap!               |");
        System.out.println("| Buahahahahahaahahahahahhakhekhebleeeeeeeee               |");
        System.out.println("| To survive You need to quess combination of three number |");
        System.out.println("| For each numbe ryou have only three chances...           |");
        System.out.println("| But don't worry like your famous colleague...            |");
        System.out.println("| You only live twice...buhahahha...                       |");
        System.out.println(" ---------------------------------------------------------- ");

        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| You look on terminal screen and see three stars          |");
        System.out.println("| System is waiting for you move                           |");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| Type first number from 1 to 10:                          |");
        System.out.println(" ---------------------------------------------------------- ");
        int firstNumber = randomNumber();
        System.out.println(firstNumber);
        int seconNumber = randomNumber();
        System.out.println(seconNumber);
        int thirdNumber = randomNumber();
        System.out.println(thirdNumber);
        int counter = 3;
        int firstUserNumber = input.nextInt();

        while (true) {
            if (firstNumber == firstUserNumber) {
                System.out.println("You guess");
                System.out.println("Input second number");
                int secondUserNumber = input.nextInt();
                if (secondUserNumber == seconNumber) {
                    System.out.println("You guess");
                    System.out.println("Input third number");
                    int thirdUserNumber = input.nextInt();
                    if (thirdUserNumber == thirdNumber) {
                        System.out.println("BRAVO 0013 you are free...");
                        break;
                    }
                }
            } else {
                counter--;
                if (counter > 0) {
                    System.out.println("you have " + counter + " chances");

                }else {
                    System.out.println("BUM");
                    break;
                }
            }
        }
    }

    public static int randomNumber() {
       return (int) (Math.round(Math.random() * 10));

    }
}
