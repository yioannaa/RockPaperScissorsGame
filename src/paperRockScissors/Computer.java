package paperRockScissors;

import java.util.Random;

public class Computer {

    public Computer (){

    }


    public Choices choice(){

        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        switch (computerChoice){
            case 1:
                return Choices.PAPER;
            case 2:
                return Choices.ROCK;
        }

        return Choices.SCISSORS;

    }




}
