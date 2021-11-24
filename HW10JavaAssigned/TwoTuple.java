public class TwoTuple<A extends java.lang.Comparable<A>, B extends java.lang.Comparable<B>> implements Comparable<TwoTuple<A, B>>{

   private static final int LESS_THAN = -1;
   private static final int EQUAL = 0;
   private static final int GREATER_THAN = 1;

   private A i1;
   private B i2;

   public TwoTuple(A _i1, B _i2) {
      i1 = _i1;
      i2 = _i2;
   }

   public int compareTo(TwoTuple<A,B> tuple) {

      // Note use of instanceof to check that the arguemnt to this is a TwoTuple
      // and not some arbitrary object
      // if (!(tuple instanceof  TwoTuple)) {
      //    throw new ClassCastException("object "+tuple+" does not implement Comparable");
      // }
      
      TwoTuple<A,B> other = tuple;
      
      // checks if o1 is less than o2
      if (this.i1.compareTo(other.i1) == LESS_THAN || (this.i1.compareTo(other.i1) == EQUAL && this.i2.compareTo(other.i2) == LESS_THAN)){
         return LESS_THAN;
      }

      // checks if o1 == o2
      else if(this.i1.compareTo(other.i1) == EQUAL && this.i2.compareTo(other.i2) == EQUAL) {
         return EQUAL;
      }

      // determines that o1 is greater than o2
      else{
         return GREATER_THAN;
      }
   }

   public String toString( ) {
      return "["+i1+","+i2+"]";
   }
}
