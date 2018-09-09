package project;

public class CharacterCreator {

	Character myCharacter = new Character();

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() { project.GUI.createAndShowGUI();}
		});
	}
}
