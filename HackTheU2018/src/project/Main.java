package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String sex = "";

		System.out.println("Type male or female: ");
		
		Scanner keys = new Scanner(System.in);
		
		sex = keys.nextLine();
		
		keys.close();
		
		CharacterCreator creator = new CharacterCreator();
		
		project.CharacterCreator.Character myCharacter = creator.makeCharacter(sex);
		
		try {
			PrintPdf.print(myCharacter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
