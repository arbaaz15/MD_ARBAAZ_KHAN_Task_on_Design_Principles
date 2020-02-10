package MD_ARBAAZ_KHAN.EPAM_Task_3;


class Function implements Add,Sub,Mul,Div
{
	

	public void addition(double a, double b)
	{
		double c = a + b;
		System.out.println ("The total value is " + c);
		
	}
	
		
	public void substraction(double a1, double b1)
		{
			
			
		   double c1 = a1 - b1;
			System.out.println ("The total value is " + c1);
			
		}
		
		
		 public void multiplication(double a2, double b2)
		 {
		
			double c2 = a2 * b2;
			
			System.out.println ("The total value is " + c2);
			
		}
		
		
		public void division(double x, double y)
		 {
				
			
				double z = x / y;
				System.out.println ("The total value is " + z);
				
		}

		 
}

