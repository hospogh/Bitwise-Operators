/****************************************************************
 * Homework Bitwise Operators: 2
 * Problem2.java //
 *
 * @author Hovsep Poghosyan 6.1
 *
 ***************************************************************/

import java.util.Scanner;
//import  java.lang.Integer;
public class Problem2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       //int number in binary -> max 33 length;
        int n = sc.nextInt();
        int k = sc.nextInt();//k is (k+1)th digit
        int nCopy = n;

        //delete k+1 digits from right side n;
        n = n >> (k + 1);
        n = n << (k + 1);

        //delete 32-k digits form left side nCopy;
        nCopy = nCopy << (33 - k);
        nCopy = nCopy >>> (33 - k);

        //combine n and nCopy
        n = n | nCopy;

        System.out.println(n);

    }
}