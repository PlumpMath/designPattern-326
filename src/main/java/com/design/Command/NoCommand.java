package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do Nothing");
    }

    @Override
    public void undo() {
        System.out.println("do nothing");

    }
}
