package comandTest;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        GarageDoor garageDoor=new GarageDoor();
        LightOnCommand lightOn=new LightOnCommand(light);
        GarageOpenDoorCommand garageOpenDoorCommand=new GarageOpenDoorCommand(garageDoor);
        

        remote.SetCommand(lightOn);
        remote.buttonWasPressed();
        remote.SetCommand(garageOpenDoorCommand);
        remote.buttonWasPressed();
    }
}
