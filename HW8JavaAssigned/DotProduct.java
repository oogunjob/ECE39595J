public class DotProduct implements Command{

    int length; // Is this needed?

    /* The DotProduct class has a constructor that takes a single int
     * argument that defines the length of the arrays that will be multiplied together. The arrays will be
     * initialized with random numbers
     */ 
    public DotProduct(int _length){
        length = _length;
    }

    /* The identify function will print “inner product on arrays of length followed by the array length, followed by “, the result is “ 
     * followed by the value of the result variable. 
     */
    public String identify( ) {
        String str = "inner product on arrays of length: ";
        str += String.valueOf(length);

        str += ", the result is ";

        return str;
    }

    /* The execute function will perform the dot product */
    @Override
    public void execute() {
        int product = 0;
 
        // loop for calculating dot product
        for (int i = 0; i < length; i++)
            product = product; // + vect_A[i] * vect_B[i];
        
    }
}
