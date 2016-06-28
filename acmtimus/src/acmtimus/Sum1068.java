/*http://acm.timus.ru/problem.aspx?space=1&num=1068

Your task is to find the sum of all integer numbers lying between 1 and N inclusive.
Input
The input consists of a single integer N that is not greater than 10000 by it's absolute value.
Output
Write a single integer number that is the sum of all integer numbers lying between 1 and N inclusive.
Sample
input	output
-3		  -5

 */
package acmtimus;

import java.util.Scanner;

public class Sum1068 {
public static void main(String[] args) {
	boolean positive=true;
	int sum=0;
	System.out.println("Enter a number except 0 or 1:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n<0){
		n=-n;
		positive=false;
	}
	for(int i=n;i>1;i--){
		sum=sum+i;
	}
	if(sum!=0){
		if(positive)
			System.out.println(sum);
		else
			System.out.println(-sum);
	}
	else
		System.out.println("Invalid input");
	sc.close();
}
}
