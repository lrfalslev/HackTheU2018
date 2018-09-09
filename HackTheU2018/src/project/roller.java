package project;

import java.util.Random;
import java.lang.Math;
public class roller {

	public static int[] Roll() {

		int[] traits = new int[6];

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

<<<<<<< HEAD
			firstRoll = rand.nextInt(6) + 1;
			secondRoll = rand.nextInt(6) + 1;
			thirdRoll = rand.nextInt(6) + 1;
			fourthRoll = rand.nextInt(6) + 1;

			lowRoll = Math.min(firstRoll, secondRoll);
			lowRoll = Math.min(lowRoll, thirdRoll);
			lowRoll = Math.min(lowRoll, fourthRoll);

			traits[i] = (firstRoll + secondRoll + thirdRoll + fourthRoll - lowRoll);
		}
		
		return traits;
	}
}
=======
            lowRoll = Math.min(firstRoll, secondRoll);
            lowRoll = Math.min(lowRoll, thirdRoll);
            lowRoll = Math.min(lowRoll, fourthRoll);
            System.out.println(firstRoll + secondRoll + thirdRoll + fourthRoll - lowRoll);
        }}}
>>>>>>> branch 'master' of https://github.com/lrfalslev/HackTheU2018
