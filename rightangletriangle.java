package heck;

import java.util.Scanner;

public class inverted_ra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();

        for(int y = 0; y < rows;y++){   // This loop keeps track of number of rows
            for(int x = 0; x < rows;x++){  // keeps track of stars to be printed

                if( x <= y) {
                    System.out.print("* ");
                }
                else{
                   System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

}
