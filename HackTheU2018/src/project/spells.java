package project;

public class spells  {
        public static String[] getSpells(String CharacterClass){

            spellList = "";
            if (CharacterClass = "Wizard") {
                spellList = "Mage Hand","Fire Bolt", "Prestidigitation", "Burning Hands", "Disguise Self", "Detect Magic",
                "Magic Missile", "Mage Armor", "Thunderwave";
            } else if (CharacterClass = "Bard") {
                spellList = "Vicious Mockery", "Friends", "Cure Wounds", "Silent Image", "Thunderwave",
                        "Tasha's Hideous Laughter";
            } else if (CharacterClass = "Cleric") {
                spellList = "Spare the Dying", "Guidance", "Word of Radiance";
            } else if (CharacterClass = "Druid") {
                spellList = "Primal Savagery", "Thorn Whip";
            }else if (CharacterClass = "Sorcerer") {
                spellList = "Thunderclap", "Mage Hand", "Prestidigitation", "Ray of Frost", "Witch Bolt", "Fog Cloud";
            }
            else if (CharacterClass = "Warlock") {
                spellList = "Eldritch Blast", "Green-Flame Blade";
            }
            else;
            spellList = "None";
            }



        }
