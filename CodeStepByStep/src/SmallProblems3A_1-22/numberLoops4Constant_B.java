/* 
 * 
 * The following program uses nested for loops to produce the following output:
 * 
 * ....1
 * ...2.
 * ..3..
 * .4...
 * 5....
 * 
 * Modify the program to use a single integer constant named SIZE that influences how many lines should
 * be drawn. For example, if the SIZE is changed to 7, the output should become the following:
 * 
 * ......1
 * .....2.
 * ....3..
 * ...4...
 * ..5....
 * .6.....
 * 7......
 * 
 */

import java.util.Scanner;

public class numberLoops4Constant_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter SIZE: ");
        int SIZE = input.nextInt(); // Define the constant SIZE
        
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE - i; j++) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        
        input.close(); // Close the Scanner object
    }
}