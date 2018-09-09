package project;
// Calculates the HP of character based on their chosen class and Con Mod.
public class hitPoints {

	public static int getHit(String classtype, int conMod) {
		int hpMax;

		{

			if (classtype.equals("Barbarian")) {
				hpMax = 12 + conMod;
			} else if (classtype.equals("Bard")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Cleric")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Druid")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Fighter")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Monk")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Paladin")) {
				hpMax = 10 + conMod;
			} else if (classtype.equals("Ranger")) {
				hpMax = 10 + conMod;
			} else if (classtype.equals("Rogue")) {
				hpMax = 8 + conMod;
			} else if (classtype.equals("Sorcerer")) {
				hpMax = 6 + conMod;
			} else if (classtype.equals("Warlock")) {
				hpMax = 8 + conMod;
			} else {
				hpMax = 6 + conMod;
			}

			return hpMax;


		}
	}
}
