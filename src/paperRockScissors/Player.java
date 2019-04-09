package paperRockScissors;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in); ;



    public Player(){

    }

    public Choices choice(){


        System.out.println("Enter your choice: P - paper, R - rock, S - Scissors");
        String playerChoice = scanner.nextLine().toUpperCase();

        switch (playerChoice){
            case "P":
                return Choices.PAPER;
            case "R":
                return Choices.ROCK;
            case "S":
                return Choices.SCISSORS;
        }

        System.out.println("Invalid input");
        return choice();
    }


}


