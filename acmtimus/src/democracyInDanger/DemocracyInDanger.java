//http://acm.timus.ru/problem.aspx?space=1&num=1025

/*Input
In the first line an only odd integer K — a quantity of groups — is written (1 <= K <= 101).
In the second line there are written K odd integers, separated with a space.
Those numbers define a number of voters in each group. 
The population of the island does not exceeds 9999 persons.

Output
You should write a minimal quantity of supporters of the party, 
that can put into effect any decision.*/

package democracyInDanger;

import java.util.Arrays;
import java.util.Scanner;

public class DemocracyInDanger {
	public static void main(String[] args) {
		System.out.println("Enter the number of groups. [Should be an odd number 1 <= K<= 101]:");
		Scanner sc=new Scanner(System.in);
		int numOfGroups=sc.nextInt();
		if(numOfGroups<1 || numOfGroups%2==0 || numOfGroups>101){
			System.out.println("Invalid");
		}
		else{
			System.out.println("Enter number of members in each group. [must be odd]:");
			int groups[]=new int[numOfGroups];
			int i=0;
			while(sc.hasNextInt())
			{
				int number=sc.nextInt();
				if(number%2==0){
					System.out.println("must be odd");
					continue;
				}
				else{
					groups[i]=number;
					i++;
				}
				if(i==groups.length){
					break;
				}
			}
			Arrays.sort(groups);
			numOfGroups=numOfGroups/2 + 1;
			int minSupp=0;
			for(int j=0;j<numOfGroups;j++){
				minSupp+=groups[j]/2 + 1;
			}
			System.out.println("Minimum support required="+minSupp);
			sc.close();
		}
	}
}
