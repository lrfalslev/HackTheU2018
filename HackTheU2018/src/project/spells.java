package project;
// Gives spells to chosen class if the class is a spell caster.
public class spells  {
        public static String[] spellSelect(String charClass){

            String spellList = "";
            if (charClass.equals("Wizard")) {
                spellList = ("Mage Hand, Fire Bolt, Prestidigitation, Burning Hands, Disguise Self, Detect Magic, Magic Missile, Mage Armor, Thunderwave");
            } else if (charClass.equals("Bard")) {
                spellList = ("Vicious Mockery, Friends, Cure Wounds, Silent Image, Thunderwave, Tasha's Hideous Laughter");
            } else if (charClass.equals("Cleric")) {
                spellList = ("Spare the Dying, Guidance, Word of Radiance");
            } else if (charClass.equals("Druid")) {
                spellList = ("Primal Savagery, Thorn Whip");
            }else if (charClass.equals("Sorcerer")) {
                spellList = ("Thunderclap, Mage Hand, Prestidigitation, Ray of Frost, Witch Bolt, Fog Cloud");
            } else if (charClass.equals("Warlock")) {
                spellList = ("Eldritch Blast, Green-Flame Blade");
            }
            else {
                spellList = "None";
            }


        return null;
        public static String getSpells (String spellList){
    return spellList();

        }}