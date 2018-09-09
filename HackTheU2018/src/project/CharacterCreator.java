package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class CharacterCreator {

	String[] races;
	HashMap<String, String[]> raceFeats = new HashMap<String, String[]>();
	HashMap<String, int[]> raceBuffs = new HashMap<String, int[]>();
	String[] classes;
	HashMap<String, String[]> classFeats = new HashMap<String, String[]>();
	String[] maleName, femaleName;
	Random rand;

	public CharacterCreator() {

		//race
		races = new String[] { "Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc",
				"Human", "Lizardfolk", "Orc", "Tabaxi", "Tiefling" };

		// Race Feats
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

		// Race Buffs (STR, DEX, CON, INT, WIS, CHAR)
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
		classes = new String[] { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };

		// Class Feats

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


		//names
		maleName = new String[]{"Anlow", "Arando", "Bram", "Cale", "Dalkon", "Daylen", "Dodd", "Dungarth", "Dyrk",
				"Eandro", "Falken", "Feck", "Fenton", "Gryphero", "Hagar", "Jeras", "Krynt", "Lavant", "Leyten", "Madian",
				"Malfier", "Markus", "Meklan", "Namen", "Navaren", "Nerle", "Nilus", "Ningyan", "Norris", "Quentin",
				"Semil", "Sevenson", "Steveren", "Talfen", "Tamond", "Taran", "Tavon", "Tegan", "Vanan", "Vincent",
                "Alarcion", "Alathar", "Ariandar", "Arromar", "Borel", "Bvachan", "Carydion", "Elgoth", "Farlien",
                "Ferel", "Gaerlan", "Iafalior", "Kaelthorn", "Laethan", "Leliar", "Leodor", "Lorak", "Lorifir", "Morian",
                "Oleran", "Rylef", "Savian", "Seylas", "Tevior", "Veyas", "Lukas", "Oliver", "Bouchard", "Dawson",
				"Frederick", "Ingram", "Madison", "Raulin", "Taran", "Abelard", "Boyle", "Deitrich", "Frederyk",
				"Isleton", "Mainfroi", "Redwald", "Taylor", "Abraham", "Bran", "Denston", "Fulke", "Ivan",
				"Mansel", "Reeve", "Templeton", "Addison", "Brice", "Derwin", "Galfrid", "Jakys", "Mathye", "Reginald",
				"Theodore", "Alaire", "Brien", "Deryk", "Ganelon", "Jeger", "Morgant", "Reinholdt", "Thomas", "Albin",
				"Bruce", "Donner", "Gared", "Jenlyns", "Morys", "Reynard", "Thrydwulf", "Aldebrand", "Bryce", "Drake",};

		femaleName = new String[]{"Azura", "Brey", "Hallan", "Kasaki", "Lorelei", "Mirabel", "Pharana", "Remora",
				"Rosalyn", "Sachil", "Saidi", "Tanika", "Tura", "Tylsa", "Vencia", "Xandrilla", "Caliope",
                "Emily", "Piper", "Rixi", "Sabretha", "Teg", "Tilly", "Toira", "Vexia", "Vil", "Vzani",
                "Zanthe", "Ziza", "Lucina", "Shina", "Emilia", "Syrana", "Resha", "Varin", "Wren", "Yuni", "Talis",
				"Kessa", "Magaltie", "Aeris", "Desmina", "Krynna", "Asralyn", "Herra", "Pret", "Kory", "Afia", "Tessel",
				"Rhiannon", "Zara", "Jesi", "Belen", "Rei", "Ciscra", "Temy", "Renalee", "Estyn", "Maarika", "Lynorr",
				"Tiv", "Annihya", "Semet", "Tamrin", "Antia", "Reslyn", "Basak", "Vixra", "Pekka", "Xavia"};
		//random
		rand = new Random();
	}

	public DndCharacter makeCharacter(String sex) {

		DndCharacter myCharacter = new DndCharacter();
		
		if(sex.startsWith("m"))
				myCharacter.name = getMale();
		else
			myCharacter.name = getFemale();

		myCharacter.race = races[rand.nextInt(11 - 0 + 1) + 0];

		myCharacter.classtype = classes[rand.nextInt(11 - 0 + 1) + 0];

		ArrayList<String> featsTraits = new ArrayList<String>(Arrays.asList(raceFeats.get(myCharacter.race)));
		featsTraits.addAll(Arrays.asList(classFeats.get(myCharacter.classtype)));
		
		myCharacter.featuresTraits = featsTraits.stream().collect(Collectors.joining("\n"));
		
		// Ability scores (STR, DEX, CON, INT, WIS, CHAR)
		int[] ability = raceBuffs.get(myCharacter.race);

		int[] temp = roller.Roll();	
		for(int idx = 0; idx < 6; idx++)
			ability[idx] += temp[idx];
		
		myCharacter.hpMax = hitPoints.getHit(myCharacter.classtype, ability[2]);
		
		myCharacter.str = ability[0];
		myCharacter.dex= ability[1];
		myCharacter.con= ability[2];
		myCharacter.inte= ability[3];
		myCharacter.wis= ability[4];
		myCharacter.cha= ability[5];
		
		myCharacter.strMod = modifier.getMod(myCharacter.str);		
		myCharacter.dexMod = modifier.getMod(myCharacter.dex);	
		myCharacter.conMod = modifier.getMod(myCharacter.con);	
		myCharacter.intMod = modifier.getMod(myCharacter.inte);	
		myCharacter.wisMod = modifier.getMod(myCharacter.wis);	
		myCharacter.chaMod = modifier.getMod(myCharacter.cha);
		
		myCharacter.xp = 0;
		
		myCharacter.spells = spells.getSpells(myCharacter.classtype);
		
		return myCharacter;

	}

	public String getMale() {
		System.out.println(maleName[rand.nextInt(maleName.length)]);
		return maleName[rand.nextInt(maleName.length)];
	}

	public String getFemale() {
		System.out.println(femaleName[rand.nextInt(femaleName.length)]);
		return femaleName[rand.nextInt(femaleName.length)] ;
	}
	
	public class DndCharacter {

		public String classtype, name, race, spells, featuresTraits;
		public int xp, str, strMod, hpMax, dex, dexMod, con, conMod, inte, intMod, wis, wisMod, cha, chaMod;

		public DndCharacter() {

		}
	}

}
