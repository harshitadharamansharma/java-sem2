
//to find whether a no. is prime or not
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter any number");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		int flag=0;
		for(int i=2;i<num;i++)
		{
			int rem=num%i;
			if(rem==0)
			{
				System.out.println("The no. is not prime ");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("the no. is prime ");
		}
	}
}
