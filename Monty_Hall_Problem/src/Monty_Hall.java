import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/*
Author: Joel Pålsson
Date:02/10/2022 02:08 (yeah don´t know why I did it so late)
Was inspired to do this because they mentioned the Monty Hall Problem on S04E08 of Brooklyn Nine-Nine, Kevin was indeed right.
 */

public class Monty_Hall {

    public static void main(String[] args) {
        double stay_stat = 0;
        double move_stat = 0;
        Random random = new Random();
        int door_picked;
        System.out.println("Monty Hall asks you to choose one of three doors.\nOne of the doors hides a prize and the other two doors have no prize.\nYou state out loud which door you pick, but you don’t open it right away." +
                "\n" +
                "Monty opens one of the other two doors, and there is no prize behind it." +
                "\n" +
                "Picture of three doors. One is open and does not have the prize.\n" +
                "At this moment, there are two closed doors, one of which you picked.\nShould you switch or move?\n");
        System.out.println("How many iterations do you want to run?");
        Scanner scanner = new Scanner(System.in);
        try {
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next(); // this is important!
            }

            int n = scanner.nextInt();
            while (n < 1) {
                if(!scanner.hasNextInt())continue;
                System.out.println("You need to enter a number that is bigger than 0!");
                n = scanner.nextInt();
            }


        for (int i = 0; i < n; i++) {
            Door_Generator doors = new Door_Generator();

            //The door the contestant chooses
            door_picked = random.nextInt(3);


            /* Since the host has removed one of the doors you only have 2 options left and if you stayed and
               where right stay_stat goes up otherwise move_stat does
             */
            switch (door_picked) {
                case 0:
                    if (doors.A) {
                        stay_stat++;
                    } else {
                        move_stat++;
                    }
                    break;
                case 1:
                    if (doors.B) {
                        stay_stat++;
                    } else {
                        move_stat++;
                    }
                    break;
                case 2:
                    if (doors.C) {
                        stay_stat++;
                    } else {
                        move_stat++;
                    }
                    break;
                default:
                    System.out.println("Something went wring when calculating!");
                    break;
            }
        }

        System.out.println("Number of iterations: " + n);
        System.out.println("Percentage right while staying: " + stay_stat / n);
        System.out.println("Percentage right while moving: " + move_stat / n);
        System.out.println("While n approaches infinity percentage is ~1/3 if you stay and ~2/3 if you move. Math is cool!");
        System.out.println("───────────▄▄▄▄▄▄▄▄▄───────────\n" +
                "────────▄█████████████▄────────\n" +
                "█████──█████████████████──█████\n" +
                "▐████▌─▀███▄───────▄███▀─▐████▌\n" +
                "─█████▄──▀███▄───▄███▀──▄█████─\n" +
                "─▐██▀███▄──▀███▄███▀──▄███▀██▌─\n" +
                "──███▄▀███▄──▀███▀──▄███▀▄███──\n" +
                "──▐█▄▀█▄▀███─▄─▀─▄─███▀▄█▀▄█▌──\n" +
                "───███▄▀█▄██─██▄██─██▄█▀▄███───\n" +
                "────▀███▄▀██─█████─██▀▄███▀────\n" +
                "───█▄─▀█████─█████─█████▀─▄█───\n" +
                "───███────────███────────███───\n" +
                "───███▄────▄█─███─█▄────▄███───\n" +
                "───█████─▄███─███─███▄─█████───\n" +
                "───█████─████─███─████─█████───\n" +
                "───█████─████─███─████─█████───\n" +
                "───█████─████─███─████─█████───\n" +
                "───█████─████▄▄▄▄▄████─█████───\n" +
                "────▀███─█████████████─███▀────\n" +
                "──────▀█─███─▄▄▄▄▄─███─█▀──────\n" +
                "─────────▀█▌▐█████▌▐█▀─────────\n" +
                "────────────███████────────────");


        }catch(Exception e){
            System.out.println("Why are you stress testing my code?");
        }
        }

}
