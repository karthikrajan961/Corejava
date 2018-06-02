public class Mainclass{
public static void main(String[] args){
  Calculator calc= new Calculator();
     	int k=calc.sum(10,5);
   	int l=calc.diff(10,5);
   	int m=Calculator.div(10,5);
   	int n=Calculator.prod(10,5);
 	System.out.println("Sum ="+k);
   	System.out.println("DIfference ="+l);
   	System.out.println("Dividend ="+m);
   	System.out.println("Product ="+n);
}
}