package main.ex.ex4;

import main.ex.ex4.after.Context;
import main.ex.ex4.after.DraftState;
import main.ex.ex4.before.Document;

public class Client {

    public static void main(String[] args) {

        //before
        Document document = new Document();
        document.render();
        document.publish();

        //상태에 따라 render, publish가 바뀐다.
        //상태를 객체화..
        Context context = new Context();
        context.setState(new DraftState());
        context.render();
        context.publish();

        context.render();
        context.publish();

        context.render();
        context.publish();

    }
}
