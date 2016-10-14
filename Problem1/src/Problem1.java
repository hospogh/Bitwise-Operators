/****************************************************************
 * Homework Bitwise Operators: 1
 * Problem1.java //
 *
 * @author Hovsep Poghosyan 6.1
 ***************************************************************/

import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        short num = sc.nextShort();
        String bin = "help";
        //char l = '0';
        String h = "";
        int sign = 0;
        if (num < 0) {
            num = (short) (0 - num);
            num++;
            sign = 1;
            while (num != 0) {
                bin = bin + (^num % 2);
                num /= 2;
                //l++;
            }

        }
        else{
            while (num != 0) {
                bin = bin +(num % 2);
                num /= 2;
                //l++;
            }
        }

       while(h.length() < 4 + 8 - bin.length()){
           h += sign; //4+8  ->"help".length()=4; short length=8;
       }

        bin = bin.replace("help", h);
        System.out.println(bin);
    }
}