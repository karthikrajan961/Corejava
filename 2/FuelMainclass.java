public class FuelMainclass{
public static void main(String[] args){

Fuel petrol = new Fuel();
petrol.fuelType="PETROL";
petrol.fuelPrice=82;
Fuel.fuelQuality="POWER";
petrol.PetrolInfo();

Fuel diesel = new Fuel();
diesel.fuelType="DIESEL";
diesel.fuelPrice=71;
Fuel.fuelQuality="NORMAL";
diesel.DiesellInfo();

}

}