package heck;

import java.util.Scanner;

public class in_tri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows to be printed");
    int rows = sc.nextInt();

    for(int y = 0; y < rows;y++){   // This loop keeps track of number of rows
        for(int x = 0; x < rows;x++){  // keeps track of char to be printed

            if( x >= y) {       // condition to write star
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }

}
}
