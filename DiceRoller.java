import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        PairOfDice diceSet1, diceSet2;
        int numSides, wins = 0, losses = 0, ties = 0;
        String input = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides you want all the dice to have.");
        numSides = scanner.nextInt();

        diceSet1 = new PairOfDice(numSides);
        diceSet2 = new PairOfDice(numSides);

        do {
            System.out.println();
            input = "";
            diceSet1.roll();
            diceSet2.roll();
            System.out.println("Your roll: " + diceSet1.toString());
            System.out.println("Computer's roll: " + diceSet2.toString());

            if(diceSet1.getTotal() > diceSet2.getTotal()) {
                System.out.println();
                System.out.println("You win!");
                wins++;
            } else if(diceSet2.getTotal() > diceSet1.getTotal()) {
                System.out.println();
                System.out.println("You lose!");
                losses++;
            } else if(diceSet2.getTotal() == diceSet1.getTotal()) {
                System.out.println();
                System.out.println("You tied!");
                ties++;
            }

            System.out.println();
            System.out.println("Your wins: " + wins + " Computer's wins: " + losses + " Ties: " + ties);

            System.out.println();
            System.out.println("Do you want to roll again? (Y)es to continue, anything else to quit.");
            input = scanner.next();
        } while (input.toLowerCase().equals("y"));
        scanner.close();
        System.out.println();
        System.out.println("Thanks for playing!");
    }
    
}
