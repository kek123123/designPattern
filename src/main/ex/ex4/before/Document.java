package main.ex.ex4.before;

public class Document {
    private String state = "DRAFT";

    public void render() {
        if (state.equals("DRAFT")) {
            System.out.println("Rendering draft document.");
        } else if (state.equals("REVIEW")) {
            System.out.println("Rendering document under review.");
        } else if (state.equals("APPROVED")) {
            System.out.println("Rendering approved document.");
        }
    }

    public void publish() {
        if (state.equals("DRAFT")) {
            System.out.println("Document sent for review.");
            state = "REVIEW";
        } else if (state.equals("REVIEW")) {
            System.out.println("Document approved.");
            state = "APPROVED";
        } else if (state.equals("APPROVED")) {
            System.out.println("Document is already approved.");
        }
    }

    public String getState() {
        return state;
    }
}
