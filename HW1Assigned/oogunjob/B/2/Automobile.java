public class Automobile{

   private int identificationNumber;
   private float miles;
   private int month;
   private int date;
   private int year;
      
   /* constructor function */
   public Automobile(int _identificationNumber, float _miles, int _month, int _date, int _year){
      identificationNumber = _identificationNumber;
      miles = _miles;
      month = _month;
      date = _date;
      year = _year;
   };
         
   /* setter functions */
   public void setIdentificationNumber(int _identificationNumber){
      identificationNumber = _identificationNumber; 
   }
         
   public void setMiles(float _miles){
      miles = _miles;
   }
         
   public void setMaintenanceDate(int _month, int _date, int _year){
      month = _month;
      date = _date;
      year = _year;
   }
      
   /* getter functions */
   public int getVIN( ){
      return identificationNumber;
   }

   float getMileage( ){
      return miles;
   }

   String getMaintenanceDate( ){
      return Integer.toString(month) + "/" + Integer.toString(date) + "/" + Integer.toString(year);
   }
}