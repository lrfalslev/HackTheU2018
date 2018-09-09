package project;

public class Character {

	Character() {

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
