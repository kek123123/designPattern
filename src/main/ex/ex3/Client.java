package main.ex.ex3;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.addNotification(new UserA());
        subject.addNotification(new UserB());
        subject.addNotification(new UserC());

        subject.push();
    }
}
