public class Turndown extends Volume{
    public void execute(){
       System.out.println("Volume turned down to " + --volume);
    }
 
    public String toString(){
       return "Turndown";
    }
 }
