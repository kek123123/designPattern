package main.ex.ex8;

import main.ex.ex8.after.Context;
import main.ex.ex8.after.ExcelFile;
import main.ex.ex8.after.File;
import main.ex.ex8.before.DocumentEditor;

public class Client {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.openDocument("PDF");
        documentEditor.saveDocument("PDF");

        File excelFile = new ExcelFile();
        Context context = new Context(excelFile);
        context.open();
        context.save();
    }
}
