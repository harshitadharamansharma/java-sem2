/*7. To find the sum of any number of integers interactively, i.e., entering every number from the keyboard, 
     whereas the total number of integers is given as a command line argument*/

import java.util.Scanner;
class q7
{
	public static void main(String []args)
	{
		int a,i,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.print("\n\tEnter numbers :");
		for( i=0; i<Integer.parseInt(args[0]) ; i++)
		{
			a=s.nextInt();
			sum+=a;
		}
		System.out.println("\n\tSum of the entered numbers is "+sum);
	}
}