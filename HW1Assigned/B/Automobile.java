

public class Automobile{
   private int identificationNumber;
   private float miles;
   private String maintenanceDate;
      
   /* constructor function */
   public Automobile(int _identificationNumber, float _miles, int _month, int _date, int _year){
      identificationNumber = _identificationNumber;
      miles = _miles;
      maintenanceDate = Integer.toString(_month) + "/" + Integer.toString(_date) + "/" + Integer.toString(_year);
   };
         
   /* setter functions */
   public void setIdentificationNumber(int _identificationNumber){
      identificationNumber = _identificationNumber; 
   }
         
   public void setMiles(float _miles){
      miles = _miles;
   }
         
   public void setMaintenanceDate(int _month, int _date, int _year){
      maintenanceDate = Integer.toString(_month) + "/" + Integer.toString(_date) + "/" + Integer.toString(_year);
   }
      
   /* getter functions */
   public int getVIN( ){
      return identificationNumber;
   }

   float getMileage( ){
      return miles;
   }

   String getMaintenanceDate( ){
      return maintenanceDate;
   }
}