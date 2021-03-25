package command;

public class StereoOnWithCommand implements Commands {
    Stereo stereo;

    public StereoOnWithCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
