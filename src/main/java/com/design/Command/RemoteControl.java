package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command preCommand;

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
        preCommand = offCommands[slot];
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        preCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonWasPushed(){
        preCommand.undo();
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
