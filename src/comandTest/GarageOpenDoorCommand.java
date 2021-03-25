package comandTest;

public class GarageOpenDoorCommand implements Command{
    GarageDoor garageDoor;

    public  GarageOpenDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
