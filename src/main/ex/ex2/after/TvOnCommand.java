package main.ex.ex2.after;

public class TvOnCommand implements Command {

    private AfterTv afterTv;

    public TvOnCommand(AfterTv afterTv) {
        this.afterTv = afterTv;
    }
    @Override
    public void execute() {
        afterTv.turnOn();
    }
}
