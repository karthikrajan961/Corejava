public class Vehicle{

   public String vehicleType;
   public String technology;   
   
   public static String companyName = "Default Company";
      
   public void startEngine(){
      System.out.println("Company " + companyName  );   
      System.out.println("Start Engine using " + technology  );   
   }
   
   
   public static void stopEngine(){
    System.out.println("Stop Engine using " + technology);      
   }

}