//5. To convert a decimal to binary number
import java.util.Scanner;
class q5
{
	public static void main(String []args)
	{
		int binary[] = new int[40];
		int i=0 ;
		int num=Integer.parseInt(args[0]);
		System.out.print("\n\tDecimal to binary of number  " + num +" is : ");
     		while(num> 0)
     		{
		       binary[i++] = num%2;
			num = num/2;
	     	}
	    	for(int f = i-1;f >= 0;f--) 
		System.out.print(binary[f]);
	}
}	
