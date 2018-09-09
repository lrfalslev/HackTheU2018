package project;
// Rolls ability scores, 4d6 drops lowest roll.

import java.util.Random;
public class roller {

	public static int[] Roll() {

		int[] rolls = new int[6];

		Random rand = new Random();

		int firstRoll = rand.nextInt(6) + 1;
		int secondRoll = rand.nextInt(6) + 1;
		int thirdRoll = rand.nextInt(6) + 1;
		int fourthRoll = rand.nextInt(6) + 1;

		int lowRoll;
		lowRoll = Math.min(firstRoll, secondRoll);
		lowRoll = Math.min(lowRoll, thirdRoll);
		lowRoll = Math.min(lowRoll, fourthRoll);

		int i;
		for (i = 0; i < 6; i++) {

			firstRoll = rand.nextInt(6) + 1;
			secondRoll = rand.nextInt(6) + 1;
			thirdRoll = rand.nextInt(6) + 1;
			fourthRoll = rand.nextInt(6) + 1;

			lowRoll = Math.min(firstRoll, secondRoll);
			lowRoll = Math.min(lowRoll, thirdRoll);
			lowRoll = Math.min(lowRoll, fourthRoll);

			rolls[i] = (firstRoll + secondRoll + thirdRoll + fourthRoll - lowRoll);
		}
		
		return rolls;
}
}