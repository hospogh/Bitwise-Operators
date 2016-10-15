/****************************************************************
 * Homework Bitwise Operators: 3
 * Problem3.java //
 *
 * @author Hovsep Poghosyan 6.1
 *
 ***************************************************************/

import java.util.Scanner;

//import  java.lang.Integer;
public class Problem3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        int mn = m ^ n;

        while (mn != 0) { // from Program1.java
            mn = mn << 1;
            if (mn < 0) {
                i++;
            }
        }
        System.out.println(i);

    }
}