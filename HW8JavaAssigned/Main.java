public class Main {

   public static final int numSorts = 4;

   public static void main(String[ ] args) {

      QuickSort sorts[ ] = new QuickSort[numSorts];
      int sortSize = 4;
      for (int i=0; i<numSorts; i++) {
         sorts[i] = new QuickSort(sortSize);
         sortSize *= 2;
      }

      sortSize = 512000;
      for (int i=0; i<numSorts; i++) {
         long startTime = System.nanoTime( );
         sorts[i].sort( );
         long endTime = System.nanoTime( );
         System.out.println("start: "+startTime+", end: "+endTime);
         System.out.println("Sort of "+sortSize+" ints took "+ (endTime-startTime)/100000. +" milliseconds");
         System.out.println("sorts["+i+"]: "+sorts[i]);
         sortSize *=2;
      }
   }
}
