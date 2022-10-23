//to add the no. enetered as command line arguments

class Sum
{
	public static void main(String args[])
	{
		int num=args.length;
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("The sum of the no. is "+sum);
	}
}
