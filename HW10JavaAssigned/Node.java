public class Node<E extends Comparable<E>> {

   private static final int LESS_THAN = -1;
   private static final int EQUAL = 0;
   private static final int GREATER_THAN = 1;

   private E data;
   Node<E> left = null;
   Node<E> right = null;

   public Node(E val) {
      data = val;
   }

   public Node<E> insertNode(E n) {
      
      if (n.compareTo(data) == EQUAL) return this;
      if (n.compareTo(data) == LESS_THAN) {
         if (left != null) return left.insertNode(n); 
         else {
            left = new Node<E>(n);
            return left;
         }
      }
      if (n.compareTo(data) == GREATER_THAN) {
         if (right != null) return right.insertNode(n); 
         else {
            right = new Node<E>(n);
            return left;
         }
      }
      assert false : "node "+n+" not inserted";
      return null;
   }

   public String toString( ) {
      String str = "";
      if (left != null) 
         str = left.toString( ) + ", ";
      str += data;
      if (right != null) 
         str += ", "+right.toString( );
      return str;
   }
}
       
