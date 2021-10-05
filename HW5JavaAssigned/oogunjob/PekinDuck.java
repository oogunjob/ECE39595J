public class PekinDuck extends Duck{

    public PekinDuck(){
        flyBehavior = new FlysPoorly( );
        quackBehavior = new Quack( );
        laysEggsBehavior = new LaysEggsNotBroody( );
    }

    public void display( ) {
        System.out.println("I'm a real pekin duck");
     }
    
}
