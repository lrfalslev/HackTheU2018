package project;

import java.io.IOException;
import javax.swing.JOptionPane;

import project.CharacterCreator.DndCharacter;

public class Main {

	public static void main(String[] args) {

		String sex = "";

		while(notValid(sex))
		{
			sex = JOptionPane.showInputDialog("Is your character Male or Female?");
			
			if(notValid(sex))
				JOptionPane.showMessageDialog(null, "Invalid input.");
		}

			CharacterCreator creator = new CharacterCreator();

			DndCharacter myCharacter = creator.makeCharacter(sex);

			try {
				PrintPdf.print(myCharacter);
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

	private static boolean notValid(String sex) {
		if(!sex.toLowerCase().equals("male") & !sex.toLowerCase().equals("m") & 
				!sex.toLowerCase().equals("female") & !sex.toLowerCase().equals("f"))
			return true;

		return false;
	}

}
