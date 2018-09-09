package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character {

	public  void Main(String[] args) {

		//lmao
	}

	public static String getRace(ArrayList<String> feats, int[] buffs)
	{
		//race
		String[] races = new String[] { "Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc",
				"Human", "Lizardfolk", "Orc", "Tabaxi", "Tiefling" };
		
		String race = races[(int) (Math.random()*12)];
		System.out.println(race);
		return race;
	}

	public static String getCharClass()
	{
		//class
		String[] classes = new String[] { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };
		
		String classtype = classes[(int) (Math.random()*12)];
		System.out.println(classtype);
		return classtype;
	}
}

