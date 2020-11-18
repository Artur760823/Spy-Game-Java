package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| Hello 0013, as usual you fell into a trap!               |");
        System.out.println("| Buahahahahahaahahahahahhakhekhebleeeeeeeee               |");
        System.out.println("| To survive You need to quess combination of three number |");
        System.out.println("| For each numbe ryou have only three chances...           |");
        System.out.println("| But don't worry like your famous colleague...            |");
        System.out.println("| You only live twice...buhahahha...                       |");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("                                                            ");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| You look on terminal screen and see three stars          |");
        System.out.println("| System is waiting for you move                           |");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("                                                            ");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("| Type first number from 1 to 10:                          |");
        System.out.println(" ---------------------------------------------------------- ");
        System.out.println("                                                            ");
        
        int firstNumber = randomNumber();
        int seconNumber = randomNumber();
        int thirdNumber = randomNumber();

        int counter = 3;

        int firstUserNumber = input.nextInt();

        while (true) {
            if (firstNumber == firstUserNumber) {
                System.out.println(" ---------------------------------------------------------- ");
                System.out.println("| You guess                                                |");
                System.out.println("| Input second number                                      |");
                System.out.println(" ---------------------------------------------------------- ");
                int secondUserNumber = input.nextInt();
                if (secondUserNumber == seconNumber) {
                    System.out.println(" ---------------------------------------------------------- ");
                    System.out.println("| You guess                                                |");
                    System.out.println("| Input third number                                       |");
                    System.out.println(" ---------------------------------------------------------- ");
                    int thirdUserNumber = input.nextInt();
                    if (thirdUserNumber == thirdNumber) {
                        System.out.println(" ---------------------------------------------------------- ");
                        System.out.println("| Again 0013                                               |");
                        System.out.println("| You were lucky ... Next time my friend, next time        |");
                        System.out.println(" ---------------------------------------------------------- ");
                        break;
                    } else {
                        counter--;
                        if(thirdUserNumber > thirdNumber){
                            System.out.println(" ---------------------------------------------------------- ");
                            System.out.println("| Too high...Sweetie Pie                                  |");
                            System.out.println(" ---------------------------------------------------------- ");
                        }else{
                            System.out.println(" ---------------------------------------------------------- ");
                            System.out.println("| Too low...Jolly Boy                                      |");
                            System.out.println(" ---------------------------------------------------------- ");
                        }
                        if (counter > 0) {
                            System.out.println("you have " + counter + " chances");
                            firstUserNumber = input.nextInt();
                        } else {
                            System.out.println("BUM");
                            break;
                        }
                    }
                } else {
                    counter--;
                    if(secondUserNumber > seconNumber){
                        System.out.println(" ---------------------------------------------------------- ");
                        System.out.println("| Too high...Sweetie Pie                                  |");
                        System.out.println(" ---------------------------------------------------------- ");
                    }else{
                        System.out.println(" ---------------------------------------------------------- ");
                        System.out.println("| Too low...Jolly Boy                                      |");
                        System.out.println(" ---------------------------------------------------------- ");
                    }
                    if (counter > 0) {
                        System.out.println("you have " + counter + " chances");
                        firstUserNumber = input.nextInt();
                    } else {
                        System.out.println("BUM");
                        break;
                    }
                }
            } else {
                counter--;
                if(firstUserNumber > firstNumber){
                    System.out.println(" ---------------------------------------------------------- ");
                    System.out.println("| Too high...Sweetie Pie                                  |");
                    System.out.println(" ---------------------------------------------------------- ");
                }else{
                    System.out.println(" ---------------------------------------------------------- ");
                    System.out.println("| Too low...Jolly Boy                                      |");
                    System.out.println(" ---------------------------------------------------------- ");
                }
                if (counter > 0) {
                    System.out.println("you have " + counter + " chances");
                    firstUserNumber = input.nextInt();
                } else {

                    int bombCountDown = 3;

                    while(bombCountDown > 0){
                        Thread.sleep(1000);
                        System.out.println(bombCountDown);
                        bombCountDown--;
                    }
                    System.out.println(" ---------------------------------------------------------- ");
                    System.out.println("| Oh Dear...Time to say goodbye, Paesi che non ho mai      |");
                    System.out.println(" ---------------------------------------------------------- ");
                    break;
                }
            }
        }

    }

    public static int randomNumber() {
        return (int) (Math.round(Math.random() * 10));

    }


}
