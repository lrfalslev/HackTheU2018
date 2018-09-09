package project;

import java.util.ArrayList;
import java.util.HashMap;

import project.Character.*;

public class CharacterCreator {

	static Character myCharacter;

	public static void main(String[] args) {
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

		String blahblahblah;
		String name;
		String classtype = new String("");
		String race;
		String Alignment;
		String level = new String("1");
		int[] traits;
		int[] buffs = new int[6];
		ArrayList<String> feats = new ArrayList<String>();
		
		
		race = Character.getRace(feats, buffs);
		classtype = Character.getCharClass();

		System.out.println(feats + "" + buffs);
		traits = roller.Roll();	
		for(int idx = 0; idx < 6; idx++)
		{
			traits[idx] += 1;
		}
		
		
		//gui window
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//			public void run() { project.GUI.createAndShowGUI();}
//		});
	}
}
