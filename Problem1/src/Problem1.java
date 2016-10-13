
/****************************************************************
 * Homework Bitwise Operators: 001
 * Problem001.java //MaxMin
 *
 * @author Hovsep Poghosyan 6.1
 ***************************************************************/

import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        a = a >> 2;
        System.out.println(a);
    }
}