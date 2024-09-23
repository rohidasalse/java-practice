public class CalculateSimpleInterest
{
     public static void main(String [] arg)
	{	
		
		int principal=Integer.parseInt(arg[0]),time=Integer.parseInt(arg[2]);

		float interestRate=Float.parseFloat(arg[1]),simpleInterest;		
		simpleInterest=(principal*interestRate*time)/100;
		
		System.out.println("Total interest price is  :"+ simpleInterest);
		


	}
}