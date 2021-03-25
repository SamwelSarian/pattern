package comandTest;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl(){
    }

    public void SetCommand(Command command){
        this.command=command;
    }
    public void buttonWasPressed(){
        command.execute();
    }
}
