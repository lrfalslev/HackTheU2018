package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String sex = "";

		Scanner keys = new Scanner(System.in);

		while(!sex.toLowerCase().equals("male") && !sex.toLowerCase().equals("female"))
		{			
			System.out.println("Type male or female: ");
			
			sex = keys.nextLine();
			
			if(!sex.toLowerCase().equals("male") && !sex.toLowerCase().equals("female"))
				System.out.println("Invalid input, ");
		}
		
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
