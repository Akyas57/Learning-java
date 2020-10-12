package heck;

import java.util.Scanner;

public class in_rat_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();

        for (int y = rows ; y > 0; y--) {   // This loop keeps track of number of rows
            for (int x = 0; x < 2 *y- 1; x++) {  // keeps track of stars to be printed

                System.out.print("* ");

            }

            System.out.println();

        }

    }
}
