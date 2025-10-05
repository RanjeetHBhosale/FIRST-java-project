 class Calculator{

public int add(int a, int b){
      return a + b;
}
public int sub(int a, int b){
      return a - b;
}
public int mul(int a, int b){
      return a * b;
}
}
public class CalculatorTest{

public static void main(String args[]){
Calculator c=new Calculator();

System.out.println("Result Of addition is: "+ c.add(1,6));
System.out.println("Result Of subtraction is: "+ c.sub(7,6));
System.out.println("Result Of multiplication is: "+ c.mul(7,6));
}

}