

/*
 * In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series:

a+(2^0)b,a+(2^0)b+(2^1)b,.....,a+(2^0)b+(2^1)b+....+(2^n-1)b

Input Format

The first line will contain the number of testcases t. Each of the next t lines will have three integers,a ,b , and n.

We have provided a code stub in the editor which handles the input operation.

Constraints
0<=t<=500
0<=a,b<=50
1<=n<=15

 * Output Format

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
import java.util.Scanner;

public class LoopAdvance {

    private static Scanner scan;

	public static void main(String[] args) {
        scan = new Scanner(System.in);
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

