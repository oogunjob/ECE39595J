import java.util.Random;

public class DotProduct implements Command{

    public static Random rando = new Random( );
    private int arr_A[ ];
    private int arr_B[ ];
    private int result;

    /* The DotProduct class has a constructor that takes a single int
     * argument that defines the length of the arrays that will be multiplied together. The arrays will be
     * initialized with random numbers
     */ 
    public DotProduct(int _length){

        // initialization of the first array
        arr_A = new int[_length];
        for (int i = 0; i <arr_A.length; i++) {
           arr_A[i] = rando.nextInt(arr_A.length);
        }

        // initialization of the second array
        arr_B = new int[_length];
        for (int i=0; i <arr_B.length; i++) {
           arr_B[i] = rando.nextInt(arr_B.length);
        }
    }

    /* The identify function will print “inner product on arrays of length followed by the array length, followed by “, the result is “ 
     * followed by the value of the result variable. 
     */
    public String identify( ) {
        String str = "inner product on arrays of length: ";
        str += String.valueOf(arr_A.length);

        // computes dot product and returns the result
        str += ", the result is " + String.valueOf(result);

        return str;
    }

    /* The execute function will perform the dot product */
    @Override
    public void execute() {
        int product = 0;
 
        // loop for calculating dot product
        for (int i = 0; i < arr_A.length; i++)
            product = product + arr_A[i] * arr_B[i];
        
        result = product;
    }
}
