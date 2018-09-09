<<<<<<< HEAD
package project;

public class Character {

	Character() {
		
		//Races + Classes
		String[] races = new String[] { "Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc",
				"Human", "Lizardfolk", "Orc", "Tabaxi", "Tiefling" };

		String[] classes = new String[] { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };

		// Feats
		String[] barbFeats = new String[] { "Rage", "Unarmored Defense" };
		String[] bardFeats = new String[] { "Spellcasting", "Bardic Inspiration" };
		String[] clericFeats = new String[] { "Spellcasting", "Divine Domain" };
		String[] druidFeats = new String[] { "Druidic", "Spellcasting" };
		String[] fightFeats = new String[] { "Fighting Style", "Second Wind" };
		String[] monkFeats = new String[] { "Unarmored Defense", "Martial Arts" };
		String[] pallyFeats = new String[] { "Divine Sense", "Lay on Hands" };
		String[] rangFeats = new String[] { "Favored Enemy", "Natural Explorer" };
		String[] rogFeats = new String[] { "Expertise", "Sneak Attack", "Thieves' Cant" };
		String[] sorcFeats = new String[] { "Spellcasting", "Sorcerous Origin" };
		String[] warFeats = new String[] { "Otherworldly Patron", "Pact Magic" };
		String[] wizFeats = new String[] { "Spellcasting", "Arcane Recovery" };

		String[] dbornFeats = new String[] { "Draconic Ancestry", "Breath Weapon", "Damage Resistance" };
		String[] dwarfFeats = new String[] { "Darkvision", "Dwarven Resilience", "Dwarven Combat Training",
				"Stonecunning" };
		String[] elfFeats = new String[] { "Darkvision", "Keen Senses", "Fey Ancestry", "Trance" };
		String[] gnomeFeats = new String[] { "Darkvision", "Gnome Cunning" };
		String[] helfFeats = new String[] { "Darkvision", "Fey Ancestry", "Skill Versatility" };
		String[] hlingFeats = new String[] { "Lucky", "Brave", "Halfling Nimbleness" };
		String[] horcFeats = new String[] { "Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks" };
		String[] humFeats = new String[] { "Extra Language" };
		String[] lizFeats = new String[] { "Bite", "Cunning Artisan", "Hold Breath", "Hunter's Lore", "Natural Armor",
				"Hungry Jaws" };
		String[] orcFeats = new String[] { "Darkvision", "Aggressive", "Menacing", "Powerful Build" };
		String[] tabFeats = new String[] { "Darkvision", "Feline Agility", "Cat's Claws", "Cat's Talent" };
		String[] tiefFeats = new String[] { "Darkvision", "Hellish Resistance", "Infernal Legacy" };

		// Buffs (STR, DEX, CONST, INT, WIS, CHAR)
		int[] dragBuff = { 2, 0, 0, 0, 0, 1 };
		int[] dwarfBuff = { 0, 0, 2, 0, 0, 0 };
		int[] elfBuff = { 0, 2, 0, 0, 0, 0 };
		int[] gnomeBuff = { 0, 0, 0, 2, 0, 0 };
		int[] halfElfBuff = { 0, 0, 0, 1, 1, 2 };
		int[] halfBuff = { 0, 2, 0, 0, 0, 0 };
		int[] halfOrcBuff = { 2, 0, 1, 0, 0, 0 };
		int[] humanBuff = { 1, 1, 1, 1, 1, 1 };
		int[] lizBuff = { 0, 0, 2, 0, 1, 0 };
		int[] orcBuff = { 2, 0, 1, -2, 0, 0 };
		int[] baxiBuff = { 0, 2, 0, 0, 0, 1 };
		int[] tieBuff = { 0, 0, 0, 1, 0, 2 };

		int test;

	}
}
=======
package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character {

	public  void Main(String[] args) {

		//race
		String[] races = new String[] { "Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc",
				"Human", "Lizardfolk", "Orc", "Tabaxi", "Tiefling" };

		// Race Feats
		HashMap<String, String[]> raceFeats = new HashMap<String, String[]>();

		raceFeats.put("Dragonborn", new String[] { "Draconic Ancestry", "Breath Weapon", "Damage Resistance" });
		raceFeats.put("Dwarf", new String[] { "Darkvision", "Dwarven Resilience", "Dwarven Combat Training",
		"Stonecunning" });
		raceFeats.put("Elf", new String[] { "Darkvision", "Keen Senses", "Fey Ancestry", "Trance" });
		raceFeats.put("Gnome", new String[] { "Darkvision", "Gnome Cunning" });
		raceFeats.put("Half-Elf", new String[] { "Darkvision", "Fey Ancestry", "Skill Versatility" });
		raceFeats.put("Halfling", new String[] { "Lucky", "Brave", "Halfling Nimbleness" });
		raceFeats.put("Half-Orc", new String[] { "Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks" });
		raceFeats.put("Human", new String[] { "Extra Language" });
		raceFeats.put("Lizardfolk", new String[] { "Bite", "Cunning Artisan", "Hold Breath", "Hunter's Lore", "Natural Armor",
		"Hungry Jaws" });
		raceFeats.put("Orc", new String[] { "Darkvision", "Aggressive", "Menacing", "Powerful Build" });
		raceFeats.put("Tabaxi", new String[] { "Darkvision", "Feline Agility", "Cat's Claws", "Cat's Talent" });
		raceFeats.put("Tiefling", new String[] { "Darkvision", "Hellish Resistance", "Infernal Legacy" });

		// Race Buffs (STR, DEX, CONST, INT, WIS, CHAR)
		HashMap<String, int[]> raceBuffs = new HashMap<String, int[]>();

		raceBuffs.put("Dragonborn", new int[] { 2, 0, 0, 0, 0, 1 });
		raceBuffs.put("Dwarf", new int[] { 0, 0, 2, 0, 0, 0 });
		raceBuffs.put("Elf", new int[] { 0, 2, 0, 0, 0, 0 });
		raceBuffs.put("Gnome", new int[] { 0, 0, 0, 2, 0, 0 });
		raceBuffs.put("Half-Elf", new int[] { 0, 0, 0, 1, 1, 2 });
		raceBuffs.put("Halfling", new int[] { 0, 2, 0, 0, 0, 0 });
		raceBuffs.put("Half-Orc", new int[] { 2, 0, 1, 0, 0, 0 });
		raceBuffs.put("Human", new int[] { 1, 1, 1, 1, 1, 1 });
		raceBuffs.put("Lizardfolk", new int[] { 0, 0, 2, 0, 1, 0 });
		raceBuffs.put("Orc", new int[] { 2, 0, 1, -2, 0, 0 });
		raceBuffs.put("Tabaxi", new int[] { 0, 2, 0, 0, 0, 1 });
		raceBuffs.put("Tiefling", new int[] { 0, 0, 0, 1, 0, 2 });

		//class
		String[] classes = new String[] { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };

		// Class Feats
		HashMap<String, String[]> classFeats = new HashMap<String, String[]>();

		classFeats.put("Barbarian", new String[] { "Rage", "Unarmored Defense" });
		classFeats.put("Bard", new String[] { "Spellcasting", "Bardic Inspiration" });
		classFeats.put("Cleric", new String[] { "Spellcasting", "Divine Domain" });
		classFeats.put("Druid", new String[] { "Druidic", "Spellcasting" });
		classFeats.put("Fighter", new String[] { "Fighting Style", "Second Wind" });
		classFeats.put("Monk",new String[] { "Unarmored Defense", "Martial Arts" });
		classFeats.put("Paladin", new String[] { "Divine Sense", "Lay on Hands" });
		classFeats.put("Ranger", new String[] { "Favored Enemy", "Natural Explorer" });
		classFeats.put("Rogue", new String[] { "Expertise", "Sneak Attack", "Thieves' Cant" });
		classFeats.put("Sorcerer", new String[] { "Spellcasting", "Sorcerous Origin" });
		classFeats.put("Warlock", new String[] { "Otherworldly Patron", "Pact Magic" });
		classFeats.put("Wizard", new String[] { "Spellcasting", "Arcane Recovery" });


	}

	public static String getRace(ArrayList<String> feats, int[] buffs)
	{
		String race = races[(int) (Math.random()*12)];
		feats.add(barbFeats.toString());
		return race;
	}

	public  String getCharClass(String[] feats)
	{
		return "";
	}
}

>>>>>>> branch 'master' of https://github.com/lrfalslev/HackTheU2018.git
