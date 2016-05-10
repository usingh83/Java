package day1.examples;

import java.util.Scanner;
/*Output Format

Print the answer to each test case in separate lines.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

In the first case:

1st term=0+1*2=2
2nd term=0+1*2+2*2=6
3rd term=0+1*2+2*2+4*2=14
and so on.
*/

public class LoopAdvance {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
            {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int n=scan.nextInt();
            int sum=a;
                for(int k=0;k<n;k++)
                    {
                sum=sum+(b*power(2,k));
                System.out.print(sum+" ");
                }
                System.out.println();        
            
        }
    }

	private static int power(int i, int j) {
		int result=1;
		for(int x=0;x<j;x++)
		result=result*i;
		return result;
	}
	}

