package project;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JWindow;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class PrintPdf {

	public static void print(project.CharacterCreator.DndCharacter myCharacter) throws IOException {

		String[] fieldNames = new String[] {"ClassLevel", "CharacterName", "Race ", "XP", "STR", "STRmod", "HPMax", "DEX", "DEXmod ", 
				"CON", "CONmod", "INT", "INTmod", "WIS", "WISmod", "CHA", "CHamod",	"AttacksSpellcasting", "Features and Traits"};

		String[] values = new String[] {myCharacter.classtype + ": LVL 1", myCharacter.name, myCharacter.race, myCharacter.xp+"", 
				myCharacter.str+"", myCharacter.strMod+"", myCharacter.hpMax+"", myCharacter.dex+"", myCharacter.dexMod+"", 
				myCharacter.con+"", myCharacter.conMod+"", myCharacter.inte+"", myCharacter.intMod+"", myCharacter.wis+"", 
				myCharacter.wisMod+"", myCharacter.cha+"", myCharacter.chaMod+"", myCharacter.spells, myCharacter.featuresTraits};

		PDDocument pdf = PDDocument.load(new File("Character Sheet - Form Fillable.pdf"));
		// C:\Users\mildo\Desktop\HackU 2018 DND\HackTheU2018\HackTheU2018\Character Sheet - Form Fillable.pdf
		PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();

		if (acroForm != null)
		{
			for(int idx = 0; idx < fieldNames.length; idx++)
			{
				PDField field = (PDField) acroForm.getField(fieldNames[idx]);
				field.setValue(values[idx]);
			}
		}

		JFileChooser fileChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF files", "pdf");
		fileChooser.setFileFilter(filter);

		java.util.logging.Logger.getLogger("org.apache.pdfbox").setLevel(java.util.logging.Level.OFF);

		JWindow window = new JWindow();
		if (fileChooser.showSaveDialog(window) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			pdf.save(file);
			Desktop.getDesktop().open(file);
			pdf.close();
		}
		
	}
}
