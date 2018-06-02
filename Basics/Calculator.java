public class Calculator{

 public int sum(int i, int j){
   int sum = i + j;
   return(sum);
 }

 public int diff(int i, int j){
  int diff = i - j;
  return(diff);
 }

 public static int div(int i, int j){
  int div = i / j;
  return(div);
 }

 public static int prod(int i, int j){
 int prod = i * j;
 return(prod);
 }

  public static void main(String[] args){
  Calculator calc= new Calculator();
     	int k=calc.sum(10,5);
   	int l=calc.diff(10,5);
   	int m=div(10,5);
   	int n=prod(10,5);
 	System.out.println("Sum ="+k);
   	System.out.println("DIfference ="+l);
   	System.out.println("Dividend ="+m);
   	System.out.println("Product ="+n);
}
}