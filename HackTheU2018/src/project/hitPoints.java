package project;
// Calculates the HP of character based on their chosen class and Con Mod.
public class hitPoints {
    public static int getHit;
    String[] classes;
    String[] classtype;
    int conMod;
    int hpMax;

    {

        if (classtype.equals("Barbarian")) {
            int hpMax = 12 + conMod;
        } else if (classtype.equals("Bard")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Cleric")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Druid")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Fighter")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Monk")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Paladin")) {
            int hpMax = 10 + conMod;
        } else if (classtype.equals("Ranger")) {
            int hpMax = 10 + conMod;
        } else if (classtype.equals("Rogue")) {
            int hpMax = 8 + conMod;
        } else if (classtype.equals("Sorcerer")) {
            int hpMax = 6 + conMod;
        } else if (classtype.equals("Warlock")) {
            int hpMax = 8 + conMod;
        } else {
            int hpMax = 6 + conMod;
        }


    }}
    // (Objects.equals(classtype, "Barbarian"))
