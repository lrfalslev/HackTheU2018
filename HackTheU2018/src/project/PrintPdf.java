package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class PrintPdf {

	public static void Main(String[] args) throws IOException {

		File sheet = new File("/HackTheU2018/Character Sheet - Form Fillable.pdf");

		PDDocument pdf = PDDocument.load(sheet);

		PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();

		if (acroForm != null)
		{
			PDField field = (PDField) acroForm.getField( "character name" );
			field.setValue("jeff");
		}
		
		Display display = new Display();
	    Shell shell = new Shell(display);
	    shell.open();
	    DirectoryDialog dialog = new DirectoryDialog(shell);
	    dialog.setFilterPath("c:\\"); // Windows specific
	    System.out.println("RESULT=" + dialog.open());
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	  }
//		DirectoryDialog dialog = new FileDialog(shell, SWT.OPEN);
//		dialog.setFilterExtensions(new String [] {"*.html"});
//		dialog.setFilterPath("c:\\temp");
//		String result = dialog.open();

	}


