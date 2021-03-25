package command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        Light livingRoomLight=new Light("Living Room");
        Light kitсhenlight =new Light("Kitchen");
        Stereo stereo=new Stereo();

        LightOffCommand lightOffCommand=new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenlightoffCommand=new LightOffCommand(kitсhenlight);
        StereoOnWithCommand stereoOnWithCommand=new StereoOnWithCommand(stereo);


        remoteControl.setCommands(0,lightOffCommand,lightOffCommand);
        remoteControl.setCommands(1,kitchenlightoffCommand,kitchenlightoffCommand);
        remoteControl.setCommands(2,stereoOnWithCommand,stereoOnWithCommand);

        System.out.println(remoteControl);

        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPressed();

    }
}
