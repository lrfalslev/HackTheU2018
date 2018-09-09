package project;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		CharacterCreator creator = new CharacterCreator();
		
		Character myCharacter = creator.makeCharacter();
		
		try {
			PrintPdf.print(myCharacter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
