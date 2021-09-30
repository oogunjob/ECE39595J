public class Turnup extends Volume{
    public void execute(){
       System.out.println("Volume turned up to " + ++volume);
    }
 
    public String toString(){
       return "Turnup";
    }
 }