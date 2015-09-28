package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light("kitchen light");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
