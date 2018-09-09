package project;
// Returns random name based on Gender of Character.
import java.util.Random;


public class nameGen {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] male = new String[]{"Anlow", "Arando", "Bram", "Cale", "Dalkon", "Daylen", "Dodd", "Dungarth", "Dyrk",
                "Eandro", "Falken", "Feck", "Fenton", "Gryphero", "Hagar", "Jeras", "Krynt", "Lavant", "Leyten", "Madian",
                "Malfier", "Markus", "Meklan", "Namen", "Navaren", "Nerle", "Nilus", "Ningyan", "Norris", "Quentin",
                "Semil", "Sevenson", "Steveren", "Talfen", "Tamond", "Taran", "Tavon", "Tegan", "Vanan", "Vincent"};

        String[] female = new String[]{"Azura", "Brey", "Hallan", "Kasaki", "Lorelei", "Mirabel", "Pharana", "Remora",
                "Rosalyn", "Sachil", "Saidi", "Tanika", "Tura", "Tylsa", "Vencia", "Xandrilla"};


//getMale(male);
//getFemale(female);
    }
    public static String getMale (String[] male){
        Random rand = new Random();
        System.out.println(male[rand.nextInt(16) + 1]);
        return male[rand.nextInt(16) + 1];

    }
    public static String getFemale (String[] female) {
        Random rand = new Random();
        System.out.println(female[rand.nextInt(16) + 1]);
        return female[rand.nextInt(16) + 1] ;
    }


}
