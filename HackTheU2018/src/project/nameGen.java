package project;

import java.util.Random;

/**
 * Returns a random name based on Gender of Character
 *
 */
public class nameGen {

	Random rand = new Random();

	public static void main(String[] args) {

		String[] female = new String[]{"Azura", "Brey", "Hallan", "Kasaki", "Lorelei", "Mirabel", "Pharana", "Remora",
				"Rosalyn", "Sachil", "Saidi", "Tanika", "Tura", "Tylsa", "Vencia", "Xandrilla"};


		//getMale();
		//getFemale(female);
	}
	public static String getMale (){
		
		String[] name = new String[]{"Anlow", "Arando", "Bram", "Cale", "Dalkon", "Daylen", "Dodd", "Dungarth", "Dyrk",
				"Eandro", "Falken", "Feck", "Fenton", "Gryphero", "Hagar", "Jeras", "Krynt", "Lavant", "Leyten", "Madian",
				"Malfier", "Markus", "Meklan", "Namen", "Navaren", "Nerle", "Nilus", "Ningyan", "Norris", "Quentin",
				"Semil", "Sevenson", "Steveren", "Talfen", "Tamond", "Taran", "Tavon", "Tegan", "Vanan", "Vincent"};
		
		Random rand = new Random();
		System.out.println(name[rand.nextInt(name.length) + 1]);
		return name[rand.nextInt(name.length) + 1];
}

	public static String getFemale (String[] female) {
		Random rand = new Random();
		System.out.println(female[rand.nextInt(16) + 1]);
		return female[rand.nextInt(16) + 1] ;
	}


}
