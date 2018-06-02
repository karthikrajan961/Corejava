public class Fuel{
public String fuelType;
public int fuelPrice;

public static String fuelQuality;

public void PetrolInfo() {
System.out.println("Fuel Quality is "+fuelQuality);
System.out.println("Fuel used is "+fuelType);
System.out.println("Price per Litre RS:"+fuelPrice);

}

public static void DiesellInfo() {
System.out.println("Fuel Quality is "+fuelQuality);
//System.out.println("Fuel used is "+fuelType);
//System.out.println("Price per Litre RS:"+fuelPrice);

}

}