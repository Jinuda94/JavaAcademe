package java_1221;

import java.util.Random;

public class Dice {
	Random ram = new Random();
	private int dice;

	public Dice() {
		dice = ram.nextInt(5)+1;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public int getDice() {
		return dice;
	}


}
