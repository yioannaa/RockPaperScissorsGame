package paperRockScissors;


public class Game {

    private Player player;
    private Computer computer;
    private Choices computerChoice;
    private Choices playerChoice;
    private Result result;
    private int wins;
    private int loses;
    private int ties;

    public Game (){

        player = new Player();
        computer = new Computer();

    }



    public void play (){

        playerChoice = player.choice();
        computerChoice = computer.choice();
        result = result();
        showResult();
        statistics();


    }

    public Result result(){

        if (playerChoice == computerChoice){
            return Result.TIE;
        }

        switch (playerChoice){
            case PAPER:
                return (computerChoice == Choices.ROCK ? Result.WIN : Result.LOSE);
            case ROCK:
                return (computerChoice == Choices.SCISSORS ? Result.WIN : Result.LOSE);
            case SCISSORS:
                return (computerChoice == Choices.PAPER ? Result.WIN :Result.LOSE);
        }

        return Result.TIE;

    }

    public void showResult(){

        switch (result){
            case WIN:
                System.out.println(playerChoice + " beats " + computerChoice + ". You win.");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + ". You lose.");
                break;
            case TIE:
                System.out.println("It's a tie.");
        }
    }

    public void statistics(){


        if (result == Result.WIN){
            wins++;
        }else if (result == Result.LOSE){
            loses++;
        }else {
            ties++;
        }

    }

    public void showStatistcs(){

        int numberOfGames = wins + loses + ties;

        System.out.println("You have played " + numberOfGames + " games." );
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Ties: " + ties);
    }



}
