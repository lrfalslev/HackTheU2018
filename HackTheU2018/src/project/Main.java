package project;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String sex = "";

		sex = JOptionPane.showInputDialog("Is your character Male or Female?");
		
		CharacterCreator creator = new CharacterCreator();
		
		project.CharacterCreator.Character myCharacter = creator.makeCharacter(sex);
		
		try {
			PrintPdf.print(myCharacter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
