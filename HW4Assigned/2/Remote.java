public class Remote {

    private static Command[ ] slots; // slots for the remote
    static Remote rc = null;
 
    public Remote(){
       slots = new Command[5];
    }

    public static Remote buildRemote(){
       // builds a remote with 5 slots that hold Command references if no Remote object has been created
       // Otherwise, returns the previously created remote object
       
       // if the remote doesn't exist, make a new remote
       if(rc == null){
         rc = new Remote();
       }
       
       return rc;
    }

    public void addCommand(int s, Command command){
      // adds the command command to slot s of the remote
      if(s < 5){
        slots[s] = command;
      }
   }

    public void removeCommand(int s){
       // removes the command in slot s
       if(s > 4){
         System.out.println("Remote has slots 0..4, you've asked to remove a command from slot " + s);
         return;
       }

       if(slots[s] == null){
          System.out.println("Remote slot " + s + " does not have a command");
          return;
       }

      slots[s] = null;
    }
 
    public void executeCommand(int s){
       // calls the execute( ) method on the object pointed to the by reference in that slot
       
       if(s > 4){
          System.out.println("Remote has slots 0..4, cannot execute a command in slot " + s);
          return;
      }

       else if(slots[s] == null){
          System.out.println("Remote slot " + s + " does not have a command to execute");
          return;
       }

       slots[s].execute();
    }
 
    public String toString(){
      // ask how to correctly print the command
      StringBuilder string = new StringBuilder();

      string.append("Remote:\n");
      
      for(int i = 0; i < 5; i++){
         if(slots[i] != null){
            string.append("slot " + i + " contains the " + slots[i].toString() + " command\n");
         }
         else{
            string.append("slot " + i + " contains no command\n");
         }
      }

      return string.toString();
    }
    
 }