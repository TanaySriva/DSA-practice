/*
Input Format: N = 3
Result:
1
01
101

Input Format: N = 6
Result:
1
01
101
0101
10101
010101
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int start_bit = (i%2 == 1) ? 1 : 0;
            for(int j=1;j<=i;j++){
                System.out.print(start_bit + " ");
                start_bit ^= 1;
            }
            System.out.println();
        }
    }
}
