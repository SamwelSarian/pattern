package command;

public class RemoteControl {
    Commands[] onCommands;
    Commands[] offCommands;
    Commands undoCommands;

    public RemoteControl() {
        onCommands = new Commands[7];
        offCommands = new Commands[7];

        Commands noCommands = new NoCommands();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommands;
            offCommands[i] = noCommands;
        }
        undoCommands=noCommands;
    }
    public void setCommands(int slot, Commands onCommands, Commands offCommands){
        this.onCommands[slot]=onCommands;
        this.offCommands[slot]=offCommands;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommands=onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommands=offCommands[slot];
    }
    public void undoButtonWasPressed(){
        undoCommands.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n-------- Remote Control -------\n");
        for (int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getName()+"           "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
