package MD_ARBAAZ_KHAN.EPAM_Task_3;

import java.util.Scanner; 



public class App 

{

	
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Function ob = new Function();
		
		
		
		System.out.println("Choose your expression: ");
		System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide ");
		
		int choice = sc.nextInt();
		
		double a;
		double b;
		System.out.println("First Num");
		a = sc.nextInt();
		System.out.print("Second Num");
		b = sc.nextInt();
		
		
		switch (choice)
		{
		
		case 1:
			ob.addition(a,b);
			break;
		case 2:
			ob.substraction(a,b);
			break;
		case 3:
			ob.multiplication(a,b);
			break;
		case 4:
			ob.division(a,b);
			break;
			
		default : 
				System.out.println("Invalid Input");
				
		}
		
	}

	 
	
}
	
	 
      

