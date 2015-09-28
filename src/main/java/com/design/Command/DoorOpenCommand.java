package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class DoorOpenCommand implements Command {
    private Door door;

    @Override
    public void execute() {
        door.open();

    }

    @Override
    public void undo() {
        door.close();

    }
    public DoorOpenCommand() {
    }

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }


}
