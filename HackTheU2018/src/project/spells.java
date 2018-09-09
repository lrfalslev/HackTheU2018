package project;
// Gives spells to chosen class if the class is a spell caster.
public class spells  {
        public static String[] spellSelect(String classtype){

            String spellList = "";
            if (classtype.equals("Wizard")) {
                spellList = ("Mage Hand, Fire Bolt, Prestidigitation, Burning Hands, Disguise Self, Detect Magic, Magic Missile, Mage Armor, Thunderwave");
            } else if (classtype.equals("Bard")) {
                spellList = ("Vicious Mockery, Friends, Cure Wounds, Silent Image, Thunderwave, Tasha's Hideous Laughter");
            } else if (classtype.equals("Cleric")) {
                spellList = ("Spare the Dying, Guidance, Word of Radiance");
            } else if (classtype.equals("Druid")) {
                spellList = ("Primal Savagery, Thorn Whip");
            }else if (classtype.equals("Sorcerer")) {
                spellList = ("Thunderclap, Mage Hand, Prestidigitation, Ray of Frost, Witch Bolt, Fog Cloud");
            } else if (classtype.equals("Warlock")) {
                spellList = ("Eldritch Blast, Green-Flame Blade");
            }
            else {
                spellList = "None";
            }


        return null;
        public static String getSpells (String spellList){
    return spellList();

        }}