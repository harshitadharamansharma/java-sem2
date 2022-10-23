//4.to define two d array dynamically

import java.util.Scanner;
class twodarray
{
	public static void main(String ar[])
	{
		int row,col;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no. of rows you want");
		row=obj.nextInt();
		System.out.println("enter the no. of columns you want " );
		col=obj.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter the elements for your array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println("your array is " );
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}
