package project;
// Calculates the HP of character based on their chosen class.
public class hitPoints {
    public static int getHit;
    String[] classes;
    String[] classtype;
    int conMod;

    {int hp = 0;

        if (classtype.equals("Barbarian")) {
            int hp = 12 + conMod;
        } else if (classtype.equals("Bard")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Cleric")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Druid")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Fighter")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Monk")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Paladin")) {
            int hp = 10 + conMod;
        } else if (classtype.equals("Ranger")) {
            int hp = 10 + conMod;
        } else if (classtype.equals("Rogue")) {
            int hp = 8 + conMod;
        } else if (classtype.equals("Sorcerer")) {
            int hp = 6 + conMod;
        } else if (classtype.equals("Warlock")) {
            int hp = 8 + conMod;
        } else {
            int hp = 6 + conMod;
        }
        return hp;

    }}
    // (Objects.equals(classtype, "Barbarian"))
