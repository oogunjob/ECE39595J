public class Tree implements Cloneable {

   private Node root = null; 

   public Tree(int data) {
      root = new Node(data);
   }

   public Tree(Tree oldTree) {
      // create a root node and then copy oldTree to the tree whose root is the
      // new root node.
      this.root = new Node(oldTree.root);
   }

   public void addNode(int data) {
      Node.addNode(root, data);
   }

   public Node getRoot( ) {
      return root;
   }

   public void printInOrder( ) {
      Node.printInOrder(root);
   }

   @Override
   public Tree clone(){
      return new Tree(this);
   }

}
