package project;
// Gives spells to chosen class if the class is a spell caster.
public class spells  {
        public static String getSpells(String classtype){

            if (classtype.equals("Wizard")) {
                return ("Mage Hand, Fire Bolt, Prestidigitation, Burning Hands, Disguise Self, Detect Magic, Magic Missile, Mage Armor, Thunderwave");
            } else if (classtype.equals("Bard")) {
                return ("Vicious Mockery, Friends, Cure Wounds, Silent Image, Thunderwave, Tasha's Hideous Laughter");
            } else if (classtype.equals("Cleric")) {
                return ("Spare the Dying, Guidance, Word of Radiance");
            } else if (classtype.equals("Druid")) {
                return ("Primal Savagery, Thorn Whip");
            }else if (classtype.equals("Sorcerer")) {
                return ("Thunderclap, Mage Hand, Prestidigitation, Ray of Frost, Witch Bolt, Fog Cloud");
            } else if (classtype.equals("Warlock")) {
                return ("Eldritch Blast, Green-Flame Blade");
            }
            else {
                return "None";
            }
        }}