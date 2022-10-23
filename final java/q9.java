/*9. Write a program to create a �distance� class with methods where distance is computed in terms of feet and inches, how to create objects of a class and to see the use of this pointer*/ 

import java.util.Scanner;


class Distance
    
{
        
	int feet;
        
	double inches;

	Distance(int i , double d)
	{
		this.feet=i;
		this.inches=d;
	}      
	public void convert(double metre)
        
	{
           
		feet=(int)(metre*3.28084);
            
		double temp=metre*3.28084;
            
		temp=temp-feet;
            
		inches=temp*12;
        
	}
        
	public void display()
        
	{
            
		System.out.println("The distance is "+feet+" ft "+inches+" in");
        
	}
    
}

public class q9

{
    
	public static void main(String args[])
    
	{
        
		Distance d = new Distance(0 ,0);
        
		System.out.print("Enter distance ( in metre ) : ");
        
		Scanner input=new Scanner(System.in);
        
		double metre=input.nextDouble();
        
		d.convert(metre);
        
		d.display();
    
	}

}

