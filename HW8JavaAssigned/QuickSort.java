import java.util.Random;

public class QuickSort implements Command{

   public static Random rando = new Random( );
   private int arr[ ];

   public QuickSort(int numElements) {
      arr = new int[numElements];
      for (int i=0; i<arr.length; i++) {
         arr[i] = rando.nextInt(arr.length);
      }
   }

   // The execute function will initiate a quick sort of the QuickSort object’s arr element
   public void sort( ) {
      quickSort(0, arr.length-1);
   }

   public String toString( ) {
      int stride = 1;
      if (arr.length > 32) {
         stride = arr.length / 32;
      }
      String ret = "num elements sorted: " + arr.length + "\n";
      for (int i = 0; i < arr.length; i += stride) {
         ret += " " + arr[i]; 
      }
      ret += "\n\n";
      return ret;
   }

   private void quickSort(int low, int high) {
      if (low < high) {
         int partitionIndex = partition(low, high);
         quickSort(low, partitionIndex-1);
         quickSort(partitionIndex+1, high);
      }
   }

   private int min(int v1, int v2) {
      return v1<v2 ? v1 : v2;
   }

   private int partition(int low, int high) {
      int pivot = arr[(low+high)/2];
      
      int pos = low-1;

      for (int j=low; j<high; j++) {
         if (arr[j] <= pivot) {
            pos++;
            int swapTemp = arr[pos];
            arr[pos] = arr[j];
            arr[j] = swapTemp;
         }
      }
      int swapTemp = arr[pos+1];
      arr[pos+1] = arr[high];
      arr[high] = swapTemp;

      return pos+1;
   }

   /* will print out “quicksort of length “ followed by the length of the array 
    * and the toString() information for a quicksort object
    */


   @Override
   public void execute(){
      sort();
   }


   @Override
   public String identify(){
      String str = "quick sort of length: ";
      str += String.valueOf(arr.length) + "\n";

      str += toString();
      return str;
   }
}
