import java.util.Scanner;

public class swapnumber {
        public static void main(String[]args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number(a):");
            int num1 = scan.nextInt();
            System.out.println("Enter the second number(b):");
            int num2 = scan.nextInt();

            int onum1 = num1;
            int onum2 = num2;

            num1 = onum2;
            num2 = onum1;

            System.out.println("a =" + num1);
            System.out.println("b =" + num2);

            scan.close();


        }

    }

