package oogunjob.vehicle;

class Vehicle {

   private String model;

   Vehicle(String _model) {
      model = _model;
      System.out.print(model);
   }

   String getModel( ) { // RINK MAKE PRIVATE
      return model;
   }

   String getVehicleModel( ) {
      return getModel( );
   }

   String getColor( ) { 
      return null;
   }

   String getEngine( ) {
      return null;
   }

   String getTransmission( ) {
      return null;
   }

   int getNumPassengers( ) {
      return 0;
   }

   String getWarranty( ) {
      return null;
   }
}
