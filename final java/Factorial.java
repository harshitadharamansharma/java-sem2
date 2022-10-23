//to find the factorial of the no.

import java.util.Scanner;
class Factorial
{
	public static void main(String ar[])
	{
			int num;
			System.out.println("enter any number");
			Scanner obj=new Scanner(System.in);
			num=obj.nextInt();
			int i=1;
			int fact=1;
			for( ;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("the factorial of a number "+fact);
	}
}	
