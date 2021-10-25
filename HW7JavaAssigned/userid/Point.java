public class Point extends ComparableArray {

   // create constructors as needed.

   public Point(int nextInt, int nextInt2) {
      super(new int[] {nextInt,nextInt2});
   }

   public Point(ComparableArray comparableArray) {
      super(comparableArray);
   }

   /*
    * haschCode( ) should return an int based on the values of the object fields
    * equals( ) should return true if two objects are equal based on the values of the
    * object fields.  Given pointArray objects i1, i2 and i3, it must also be the case 
    * that 
    * 1. if i1.equals(i2) == i2.equals(i1).
    * 2. i1.equals(i1) is true, for any i1
    * 3. if i1.equals(i2) is true, and i2.equals(i3) is true, then it must be that
    *    i1.equals(i3) is true.
    * 3. if i1.equals(i2) is true, then i1.hashCode( ) == i2.hashCode( )
    *
    * Note that if i1.equals(i2) is false, then i1.hashCode( ) can be equal or not
    *      equal to i2.hashCode( ).
    *
    * As long as these rules are followed, you can implement hashCode( ) and equals( )
    * any way you want.
    */

    public int hashCode( ){
      int sum = 0;

      for (int value : ary) {
         sum += value;
      }
      
      // returns average of the array
      return sum / ary.length;
   }

   public boolean equals(Object a){ 
      // checks to see if the object is an instance of the pointArray class
      if(a instanceof Point){
         Point pointA = (Point) a;
         
         // checks to see that the size of both arrays are equal
         if(pointA.ary.length != this.ary.length){
            return false;
         }

         else{
            // checks to see that every elements of the arrays are equal
            for(int i = 0; i < pointA.ary.length; i++){
               if(pointA.ary[i] != this.ary[i]){
                  return false;
               }
            }
         }

         // returns to true, indicating that all elements of the arrays are equal
         return true;
      }

      // two objects are not of the same type
      return false;
   }
}
