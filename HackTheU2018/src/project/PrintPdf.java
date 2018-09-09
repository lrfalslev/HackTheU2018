package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JWindow;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class PrintPdf {

	public static void main(String[] args) throws IOException {

		String[] fieldNames = new String[] {"ClassLevel", "CharacterName", "Race ", "XP", "STR", "STRmod", "HPMax", "DEX", "DEXmod ", 
				"CON", "CONmod", "INT", "INTmod", "WIS", "WISmod", "CHA", "CHamod",	"AttacksSpellcasting", "Features and Traits"};

		PDDocument pdf = PDDocument.load(new File("Character Sheet - Form Fillable.pdf"));

		PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();

//		List<PDField> fields = acroForm.getFields();
//		java.util.Iterator<PDField> it = fields.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());

		if (acroForm != null)
		{
			for (String s : fieldNames)
			{
				PDField field = (PDField) acroForm.getField( s );
				field.setValue("whazzup");							
			}
		}


		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(new JWindow()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			// save to file

			pdf.save(file);
			pdf.close();
		}
	}
}
