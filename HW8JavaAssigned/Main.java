public class Main {

   public static final int numSorts = 10;

   public static void main(String[ ] args) {
      WorkQueue workQueue = new WorkQueue(); // initialization of work queue
      
      int sortSize = 10;
      
      for (int i = 0; i < numSorts; i++) {
         workQueue.put(new QuickSort(sortSize));
         workQueue.put(new DotProduct(sortSize));
      }

      Worker[] workers_A = new Worker[2]; // two threads running at the same time
      System.out.println("Execution with 2 threads");
      for(int i = 0; i < 2; i++) {
         workers_A[i] = new Worker(workQueue);
         long startTime = System.nanoTime( );
         workers_A[i].start();
         long endTime = System.nanoTime( );
         System.out.println("start: "+startTime+", end: "+endTime);
         System.out.println("Sort of "+sortSize+" ints took "+ (endTime-startTime)/100000. +" milliseconds");
      }

      for(int i = 0; i < 2; i++) {
         try {
            workers_A[i].join();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }


      // re-initialization of queue
      for (int i = 0; i < numSorts; i++) {
         workQueue.put(new QuickSort(sortSize));
         workQueue.put(new DotProduct(sortSize));
      }

      Worker[] workers_B = new Worker[4]; // four threads running at the same time
      System.out.println("Execution with 4 threads");
      for(int i = 0; i < 4; i++) {
         workers_B[i] = new Worker(workQueue);
         long startTime = System.nanoTime( );
         workers_B[i].start();
         long endTime = System.nanoTime( );
         System.out.println("start: "+startTime+", end: "+endTime);
         System.out.println("Sort of "+sortSize+" ints took "+ (endTime-startTime)/100000. +" milliseconds");
      }

      for(int i = 0; i < 4; i++) {
         try {
            workers_B[i].join();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }

      // re-initialization of queue
      for (int i = 0; i < numSorts; i++) {
         workQueue.put(new QuickSort(sortSize));
         workQueue.put(new DotProduct(sortSize));
      }

      Worker[] workers_C = new Worker[8]; // four threads running at the same time
      System.out.println("Execution with 8 threads");
      for(int i = 0; i < 8; i++) {
         workers_C[i] = new Worker(workQueue);
         long startTime = System.nanoTime( );
         workers_C[i].start();
         long endTime = System.nanoTime( );
         System.out.println("start: "+startTime+", end: "+endTime);
         System.out.println("Sort of "+sortSize+" ints took "+ (endTime-startTime)/100000. +" milliseconds");
      }

      for(int i = 0; i < 8; i++) {
         try {
            workers_C[i].join();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
}
