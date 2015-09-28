package com.design.Command;

/**
 * Created by lei on 15-9-28.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new Light("kitchenLight");
        Light roomLight = new Light("roomLight");
        Door kitchenDoor = new Door("kitchenDoor");
        Door roomDoor = new Door("roomDoor");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
        DoorOpenCommand kitchenDoorOpenCommand = new DoorOpenCommand(kitchenDoor);
        DoorCloseCommand kitchenDoorCloseCommand = new DoorCloseCommand(kitchenDoor);
        DoorOpenCommand roomDoorOpenCommand = new DoorOpenCommand(roomDoor);
        DoorCloseCommand roomDoorCloseCommand = new DoorCloseCommand(roomDoor);

        Command [] partyOnCommands = {kitchenLightOffCommand, roomLightOffCommand, kitchenDoorCloseCommand, roomDoorCloseCommand};
        Command[] partyOffCommands = {kitchenLightOnCommand, roomLightOnCommand, kitchenDoorOpenCommand, roomDoorOpenCommand};
        Command partyOnCommand = new PartyOnCommand(partyOnCommands);
        Command partyOffCommand = new PartyOffCommand(partyOffCommands);

        remoteControl.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(1, roomLightOnCommand, roomLightOffCommand);
        remoteControl.setCommand(2, kitchenDoorOpenCommand, kitchenDoorCloseCommand);
        remoteControl.setCommand(3, roomDoorOpenCommand, roomDoorCloseCommand);
        remoteControl.setCommand(4, partyOnCommand, partyOffCommand);
        

        /*remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(3);*/
       /* remoteControl.undoButtonWasPushed();*/
        remoteControl.onButtonWasPushed(4);
    }
}
