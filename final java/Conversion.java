//to convert a decimal no. to binary 

import java.util.Scanner;
class Conversion
{
	public static void main(String ar[])
	{
		int num;
		System.out.println("enter any decimal number ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		int i=0;
		int arr[]=new int[40];
		while(num>=1)
		{
			arr[i]=num%2;
			i++;
			num=num/2;
		}
		i-=1;
		System.out.println("the binary no. is " );
		while(i>=0)
		{
			System.out.print(arr[i]);
			i--;
		}
	}
}
