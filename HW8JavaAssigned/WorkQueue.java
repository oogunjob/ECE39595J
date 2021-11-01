import java.util.ArrayList;

public class WorkQueue {

    ArrayList<Command> arr = null;

    public WorkQueue(){
        arr = new ArrayList<Command>();
    }

    public void put(Command command){
        arr.add(command);
    }

    public Command get(){
        Command reference = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        
        return reference;
    }
}
