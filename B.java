package Alphabet;

public class B {
    public static void main(String[] args) {

        int rows = 5;

        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of stars in each row
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == 3 || i == 5){
                    System.out.print("*");
                }
                else if (j == 1 || j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            // for new line after printing each row

        }
    }
}
