package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class PartyOffCommand implements Command {
    private Command[] commands ;

    public PartyOffCommand(Command[] commands) {
        this.commands = commands;
    }

    public Command[] getCommands() {
        return commands;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command :commands){
            command.execute();
        }

    }

    @Override
    public void undo() {
        for(Command command :commands){
            command.undo();
        }
    }
}
