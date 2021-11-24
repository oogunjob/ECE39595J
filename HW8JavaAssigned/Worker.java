public class Worker extends Thread {

    private WorkQueue queue = null;

    public Worker(WorkQueue _queue) {
        this.queue = _queue;
    }

    @Override
    public void run() {
        
        // performs operations until the queue is empty
        while(!queue.isEmpty()) {

            // gets the first position in the array
            Command command = queue.get();
            
            command.execute();
            System.out.println(command.identify());
        }

    }
    
}
