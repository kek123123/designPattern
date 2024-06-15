package main.behavior.command.before;

public class Client {

    public static void main(String[] args) {
        Controll controll = new Controll(new Server()); // 다른 서버로 바뀌게 되면? 컨트롤 클래스에 영향이간다.
        controll.execute();
    }
}
