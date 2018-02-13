package standard;

public class Dice_play {

	public static void main(String[] args) {
		
		
		
		int diceOne = (int) ((Math.random()*6)+1);
		int diceTwo = (int) ((Math.random()*6)+1);
		System.out.println("Points on a dice1= "+diceOne+"," +"\t"+"dice2= "+diceTwo);
		System.out.println("Total points= "+(diceOne+diceTwo));
	}

}
