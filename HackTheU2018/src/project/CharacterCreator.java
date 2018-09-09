package project;

import java.util.ArrayList;

public class CharacterCreator {

	static Character myCharacter;

	public static void main(String[] args) {
		
		String name;
		String charClass;
		String race;
		String Alignment;
		int[] traits;
		int[] buffs = new int[6];
		ArrayList<String> feats = new ArrayList<String>();
		
		Character.getRace(feats, buffs);
		
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
