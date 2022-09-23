import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    private static final String LIZARD = "Lizard";
    private static final String SPOCK = "Spock";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK, PAPER, SCISSORS, LIZARD, SPOCK");
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.printf("Hello %s, do you want to set up how many points you need to win the whole game?%n",playerName);
        System.out.print("[Y]es or press a key to continue:");
        String setNumberOfWins = scanner.nextLine();
        int banUseOf = 10;
        while (setNumberOfWins.equals("cOdEs")) {
            System.out.println("********************SECRET*****CODES**************************");
            System.out.println("**************************************************************");
            System.out.println("***BAN COMPUTER TO USE ROCK -> write *THEROCKISNOTCOKING* ****");
            System.out.println("***BAN COMPUTER TO USE PAPER -> write *ENDLESSWATERFALL* *****");
            System.out.println("***BAN COMPUTER TO USE SCISSORS -> write *REMOVESCREW* *******");
            System.out.println("***BAN COMPUTER TO USE LIZARD -> write *LIZARDEATSLIZARD* ****");
            System.out.println("***BAN COMPUTER TO USE SPOCK -> write *'LONGANDPROSPER* ******");
            System.out.println("**************************************************************");
            System.out.println("**************************************************************");
            System.out.print("ENTER CODE: ");
            setNumberOfWins = scanner.nextLine();
            switch (setNumberOfWins){
                case "THEROCKISNOTCOKING":
                    banUseOf = 0;
                    setNumberOfWins = "y";
                    System.out.println("THE ROCK IS **GONE**");
                    break;
                case "ENDLESSWATERFALL":
                    banUseOf = 1;
                    setNumberOfWins = "y";
                    System.out.println("THE PAPER IS **DAMAGED**");
                    break;
                case "REMOVESCREW":
                    banUseOf = 2;
                    setNumberOfWins = "y";
                    System.out.println("THE SCISSORS IS **BROKEN**");
                    break;
                case "LIZARDEATSLIZARD":
                    banUseOf = 3;
                    setNumberOfWins = "y";
                    System.out.println("THE LIZARD IS **EATEN**");
                    break;
                case "LONGANDPROSPER":
                    banUseOf = 4;
                    setNumberOfWins = "y";
                    System.out.println("THE SPOCK IS **DEAD**");
                    break;
            }

        }
        int n = 5;    // number of games player needs to win the whole game
        if (setNumberOfWins.toLowerCase(Locale.ROOT).equals("y")){
            System.out.print("How many points: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input is not a number.");
                scanner.nextLine();
            }

            n = scanner.nextInt();
            while (n<=0){
                System.out.println("You need to enter a number bigger than 0!");
                System.out.print("Try again: ");
                n = scanner.nextInt();
            }
            System.out.printf("You must win %d points to win the whole game.%n",n);
            scanner.nextLine();
        }else {
            System.out.println("You must win 5 points to win the whole game.");
        }

        System.out.println("Choose [r]ock, [p]aper, [s]cissors, [l]izard, [sp]ock: ");
        String playerMove = scanner.nextLine();
        int playerPoints = 0;
        while (!playerMove.toLowerCase(Locale.ROOT).equals("end")) {
            boolean emptySlot = false;
            switch (playerMove.toLowerCase(Locale.ROOT)) {
                case "r":
                case "rock":
                    playerMove = ROCK;
                    break;
                case "p":
                case "paper":
                    playerMove = PAPER;
                    break;
                case "s":
                case "scissors":
                    playerMove = SCISSORS;
                    break;
                case "l":
                case "lizard":
                    playerMove = LIZARD;
                    break;
                case "sp":
                case "spock":
                    playerMove = SPOCK;
                    break;
                default:
                    System.out.println("Invalid input. Try again...");
                    emptySlot = true;
                    break;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(5);
            while (computerRandomNumber==banUseOf) {
                computerRandomNumber = random.nextInt(5);
                System.out.println("Computer is thinking...");
                System.out.println("Computer forgot what to use...");
                System.out.println("Computer is going to choose something else.");
            }
            String computerMove = "";
            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
                case 3:
                    computerMove = LIZARD;
                    break;
                case 4:
                    computerMove = SPOCK;
                    break;
            }
            if (!emptySlot) {
                System.out.println(playerName + " chooses: " + playerMove);
                System.out.println("Computer chooses: " + computerMove);

            }
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a draw. Try again...");
            } else {
                switch (playerMove) {
                    case ROCK:
                        if (computerMove.equals(LIZARD) || computerMove.equals(SCISSORS)) {
                            playerPoints++;
                            System.out.println("You win!");
                            System.out.printf("Now you have %d points.%n", playerPoints);

                        } else {
                            playerPoints--;
                            System.out.println("You lose!");
                            System.out.printf("Now you have %d points.%n", playerPoints);
                        }
                        break;
                    case PAPER:
                        if (computerMove.equals(ROCK) || computerMove.equals(SPOCK)) {
                            playerPoints++;
                            System.out.println("You win!");
                            System.out.printf("Now you have %d points.%n", playerPoints);

                        } else {
                            playerPoints--;
                            System.out.println("You lose!");
                            System.out.printf("Now you have %d points.%n", playerPoints);
                        }
                        break;
                    case SCISSORS:
                        if (computerMove.equals(PAPER) || computerMove.equals(LIZARD)) {
                            playerPoints++;
                            System.out.println("You win!");
                            System.out.printf("Now you have %d points.%n", playerPoints);

                        } else {
                            playerPoints--;
                            System.out.println("You lose!");
                            System.out.printf("Now you have %d points.%n", playerPoints);
                        }
                        break;
                    case LIZARD:
                        if (computerMove.equals(SPOCK) || computerMove.equals(PAPER)) {
                            playerPoints++;
                            System.out.println("You win!");
                            System.out.printf("Now you have %d points.%n", playerPoints);

                        } else {
                            playerPoints--;
                            System.out.println("You lose!");
                            System.out.printf("Now you have %d points.%n", playerPoints);
                        }
                        break;
                    case SPOCK:
                        if (computerMove.equals(SCISSORS) || computerMove.equals(ROCK)) {
                            playerPoints++;
                            System.out.println("You win!");
                            System.out.printf("Now you have %d points.%n", playerPoints);

                        } else {
                            playerPoints--;
                            System.out.println("You lose!");
                            System.out.printf("Now you have %d points.%n", playerPoints);
                        }
                        break;
                }
            }
            if (playerPoints==n){
                System.out.println("Congratulations for completing the game!");
                break;
            }else if (playerPoints==-n) {
                System.out.println("It's all luck in here. Maybe you should start over.");
                break;
            }else {
                playerMove = scanner.nextLine();
            }

        }
    if (playerMove.toLowerCase(Locale.ROOT).equals("end")){
        System.out.println("Thank you for playing!");
        if (playerPoints>0){
            System.out.printf("You have made %d points.",playerPoints);
        }else if (playerPoints==0){
            System.out.print("IT'S A DRAW. Good luck next time!");
        }else {
            System.out.printf("You lost the game by %d points. Good luck next time!",Math.abs(playerPoints));
        }
    }
    }
}