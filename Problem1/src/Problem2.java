/****************************************************************
 * Homework Bitwise Operators: 2
 * Problem2.java //
 *
 * @author Hovsep Poghosyan 6.1
 * * With a help of my elder brother.
 ***************************************************************/

import java.util.Scanner;

//import  java.lang.Integer;
public class Problem2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();

        k = 1 << k;
        k = ~k;
        n = n & k;

        System.out.println(n);

    }
}