package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        NoCommand noCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWarPushed(int slot){
        offCommands[slot].execute();
    }

    public Command[] getOnCommands() {
        return onCommands;
    }

    public void setOnCommands(Command[] onCommands) {
        this.onCommands = onCommands;
    }

    public Command[] getOffCommands() {
        return offCommands;
    }

    public void setOffCommands(Command[] offCommands) {
        this.offCommands = offCommands;
    }
}
