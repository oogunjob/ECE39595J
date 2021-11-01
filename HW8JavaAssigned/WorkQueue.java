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
        return arr.remove(arr.size() - 1);
    }
}
