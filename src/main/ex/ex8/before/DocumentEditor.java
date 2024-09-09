package main.ex.ex8.before;

public class DocumentEditor {
    public void openDocument(String fileType) {
        if (fileType.equals("PDF")) {
            openPDF();
        } else if (fileType.equals("WORD")) {
            openWord();
        } else if (fileType.equals("TEXT")) {
            openText();
        } else {
            throw new UnsupportedOperationException("File type not supported: " + fileType);
        }
    }

    public void saveDocument(String fileType) {
        if (fileType.equals("PDF")) {
            savePDF();
        } else if (fileType.equals("WORD")) {
            saveWord();
        } else if (fileType.equals("TEXT")) {
            saveText();
        } else {
            throw new UnsupportedOperationException("File type not supported: " + fileType);
        }
    }

    private void openPDF() {
        System.out.println("Opening PDF document");
    }

    private void savePDF() {
        System.out.println("Saving PDF document");
    }

    private void openWord() {
        System.out.println("Opening Word document");
    }

    private void saveWord() {
        System.out.println("Saving Word document");
    }

    private void openText() {
        System.out.println("Opening Text document");
    }

    private void saveText() {
        System.out.println("Saving Text document");
    }
}
