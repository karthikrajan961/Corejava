public class Mainclass{


	public static void main(String[] args){
         Bike duke390 = new Bike();
		 duke390.company = "ktm";
		duke390.engineCC = 390;
		
		
		Bike bullet = new Bike();
		bullet.company= "RE";
		bullet.engineCC = 350;
		
		System.out.println("Duke details: "+duke390.company );
		System.out.println("Duke details: "+duke390.engineCC );
		System.out.println("Bullet details: "+bullet.company );
		System.out.println("Bullet details: "+bullet.engineCC );
	}


}