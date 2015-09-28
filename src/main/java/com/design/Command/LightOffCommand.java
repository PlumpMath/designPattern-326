package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class LightOffCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();
    }

    public LightOffCommand() {
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
