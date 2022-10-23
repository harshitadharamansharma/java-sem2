//3.to define one d array dynamically

import java.util.Scanner;
class onedarray
{
	public static void main(String args[])
	{
		int num;
		System.out.println("enter the no. of elements you want in one d array ");
		
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		int ar[]=new int [num];
		System.out.println("enter the values ");
		for(int i=0;i<num;i++)
		{
			ar[i]=obj.nextInt();
		}
		System.out.println("your array is : " );
		for(int i=0;i<num;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
