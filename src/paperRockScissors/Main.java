package paperRockScissors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        char quit = ' ';

        while (quit != 'Q'){
            game.play();
            System.out.println("Press any key to play again. To quit press 'Q'.");
            quit = scanner.nextLine().toUpperCase().charAt(0);
        }

        game.showStatistcs();


    }

}
