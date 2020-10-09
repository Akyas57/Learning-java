/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter the first number");
    int a = input.nextInt();
    System.out.println("Enter the second number");
    int b = input.nextInt();
    
    System.out.println("Sum is " + Calc.addition(a,b));
    System.out.println("Difference is " + Calc.subraction(a,b));
    System.out.println("Product is " + Calc.multiplication(a,b));
    System.out.println("Quotient is " + Calc.division(a,b));
    
    Swap.swap(a,b);
	}
}


class Calc {
    

    
    static int addition(int a,int b){
        return a+b;}
        
    static int subraction(int a,int b){
        return a-b;}
        
    static int multiplication(int a,int b){
        return a*b;}
        
    static int division(int a,int b){
        return a/b;
    }
}

class Swap {
    
    static void swap(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}