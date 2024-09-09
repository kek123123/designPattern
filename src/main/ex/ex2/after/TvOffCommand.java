package main.ex.ex2.after;

public class TvOffCommand implements Command {

    private AfterTv afterTv;

    public TvOffCommand(AfterTv afterTv) {
        this.afterTv = afterTv;
    }
    @Override
    public void execute() {
        afterTv.turnOff();
    }
}
