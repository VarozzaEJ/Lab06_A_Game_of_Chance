import java.util.Random;

public class PairOfDice {
    private Die die1, die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
        
    }
    
    public PairOfDice(int numSides) {
        die1 = new Die(numSides);
        die2 = new Die(numSides);

    }

    public int getFaceValue1() {
        return die1.getFaceValue();
    }

    public int getFaceValue2() {
        return die2.getFaceValue();
    }

    public int getTotal() {
        return (die1.getFaceValue() + die2.getFaceValue());
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public String toString() {
        int total = getTotal();
        int side1, side2;
        String totalString;
        side1 = die1.getFaceValue();
        side2 = die2.getFaceValue();
        totalString = (total + " " + "(" + side1 + " + " + side2 + ")");
        return totalString;
    }
}
