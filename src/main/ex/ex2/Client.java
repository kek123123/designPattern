package main.ex.ex2;

import main.ex.ex2.after.*;
import main.ex.ex2.before.Light;
import main.ex.ex2.before.RemoteControl;
import main.ex.ex2.before.Tv;

public class Client {

    public static void main(String[] args) {
        //before
        Light light = new Light();
        RemoteControl control = new RemoteControl(light);
        control.pressButton(true);  // Turn on the light
        control.pressButton(false); // Turn off the light

        //after
        AfterRemoteControl afterRemoteControl = new AfterRemoteControl();

        AfterLight afterLight = new AfterLight();
        LightOffCommand lightOffCommand = new LightOffCommand(afterLight);
        afterRemoteControl.produce(lightOffCommand);

        LightOnCommand lightOnCommand = new LightOnCommand(afterLight);
        afterRemoteControl.produce(lightOnCommand);

        AfterTv afterTv = new AfterTv();
        TvOffCommand tvOffCommand = new TvOffCommand(afterTv);
        afterRemoteControl.produce(tvOffCommand);

        TvOnCommand tvOnCommand = new TvOnCommand(afterTv);
        afterRemoteControl.produce(tvOnCommand);

        afterRemoteControl.consume();

        afterRemoteControl.produce(() -> System.out.println("test"));
        afterRemoteControl.consume();


    }
}
