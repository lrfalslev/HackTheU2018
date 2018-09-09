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

		//		List<PDField> fields = acroForm.getFields();
		//		java.util.Iterator<PDField> it = fields.iterator();
		//		while(it.hasNext())
		//			System.out.println(it.next());

		//		if (acroForm != null)
		//		{
		//			for (String s : fieldNames)
		//			{
		//				PDField field = (PDField) acroForm.getField( s );
		//				field.setValue("whazzup");							
		//			}
		//		}

		if (acroForm != null)
		{
			for(int idx = 0; idx < fieldNames.length; idx++)
			{
				PDField field = (PDField) acroForm.getField(fieldNames[idx]);
				field.setValue(values[idx]);
			}
		}

//		if (acroForm != null)
//		{
//			PDField field = (PDField) acroForm.getField("ClassLevel");
//			field.setValue(myCharacter.classtype + ": LVL 1");	
//			field = (PDField) acroForm.getField("CharacterName");
//			field.setValue(myCharacter.name);	
//			field = (PDField) acroForm.getField("Race ");
//			field.setValue(myCharacter.race);	
//			field = (PDField) acroForm.getField("XP");
//			field.setValue("" + myCharacter.xp);	
//			field = (PDField) acroForm.getField("STR");
//			field.setValue("" + myCharacter.str);	
//			field = (PDField) acroForm.getField("STRmod");
//			field.setValue("" + myCharacter.strMod);	
//			field = (PDField) acroForm.getField("HPMax");
//			field.setValue("" + myCharacter.hpMax);	
//			field = (PDField) acroForm.getField("DEX");
//			field.setValue("" + myCharacter.dex);	
//			field = (PDField) acroForm.getField("DEXmod ");
//			field.setValue("" + myCharacter.dexMod);	
//			field = (PDField) acroForm.getField("CON");
//			field.setValue("" + myCharacter.con);	
//			field = (PDField) acroForm.getField("CONmod");
//			field.setValue("" + myCharacter.conMod);	
//			field = (PDField) acroForm.getField("INT");
//			field.setValue("" + myCharacter.inte);	
//			field = (PDField) acroForm.getField("INTmod");
//			field.setValue("" + myCharacter.intMod);	
//			field = (PDField) acroForm.getField("WIS");
//			field.setValue("" + myCharacter.wis);	
//			field = (PDField) acroForm.getField("WISmod");
//			field.setValue("" + myCharacter.wisMod);	
//			field = (PDField) acroForm.getField("CHA");
//			field.setValue("" + myCharacter.cha);	
//			field = (PDField) acroForm.getField("CHamod");
//			field.setValue("" + myCharacter.chaMod);	
//			field = (PDField) acroForm.getField("AttacksSpellcasting");
//			field.setValue(myCharacter.spells);	
//			field = (PDField) acroForm.getField("Features and Traits");
//			field.setValue(myCharacter.featuresTraits);							
//		}
//

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
