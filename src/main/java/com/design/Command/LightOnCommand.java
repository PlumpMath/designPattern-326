package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class LightOnCommand implements Command{
    private Light light;

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();

    }

    public LightOnCommand() {
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
