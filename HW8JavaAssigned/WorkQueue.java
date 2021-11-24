import java.util.ArrayList;

public class WorkQueue {

    private ArrayList<Command> arr = null;

    public WorkQueue(){
        arr = new ArrayList<Command>();
    }

    public void put(Command command){
        arr.add(command);
    }

    public Command get(){
        return arr.remove(0);
    }

    public boolean isEmpty() {
        return arr.size() == 0 ? true : false;
    }
}
