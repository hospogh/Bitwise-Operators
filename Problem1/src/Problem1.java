/****************************************************************
 * http://moodle.infsec.am/pluginfile.php/572/mod_resource/content/1/7.%20Bitwise%20Operators.pdf  
 *
 * Homework Bitwise Operators: 1
 * Problem1.java //
 * Solution 1
 * @author Hovsep Poghosyan 6.1
 * * With a help of my elder brother.
 ***************************************************************/

import java.util.Scanner;


public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        byte num = sc.nextByte();
        for (int i = 0; i < 8; i++) {
            str += (num < 0) ? '1' : '0';
            num = (byte) (num << 1);
        }
        System.out.println(str);
    }
}
