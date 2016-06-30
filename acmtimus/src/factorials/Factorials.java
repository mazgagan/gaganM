//http://acm.timus.ru/problem.aspx?space=1&num=1083

/*
 n!!…! = n(n-k)(n-2k)…(n mod k), if k doesn’t divide n; 
n!!…! = n(n-k)(n-2k)…k, if k divides n
(There are k marks ! in the both cases).
*/
	
package factorials;
import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		System.out.println("Enter....");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] str=input.split(" ");
		int num=Integer.parseInt(str[0]);
		String[] exclamation=str[1].split("");
		int count=exclamation.length;
		int result=1;
		int rem=num%count;
		if(rem==0){
			for(int i=num;i>=count;i=i-count){
				result=result*i;
			}
		}
		else{
			for(int i=num;i>=rem;i=i-count){
				result=result*i;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
