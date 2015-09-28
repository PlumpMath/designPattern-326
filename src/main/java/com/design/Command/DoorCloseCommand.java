package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class DoorCloseCommand implements Command{
    private Door door;

    @Override
    public void execute() {
        door.close();

    }

    @Override
    public void undo() {
        door.open();

    }
    public DoorCloseCommand() {
    }

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

}
