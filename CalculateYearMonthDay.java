public class CalculatBillAccordingToDiscount
{
     public static void main(String [] arg)
	{	
		
		int amount=Integer.parseInt(arg[0]),totalBill;
		if(amount<5000)System.out.println("Discount  5% :"+ "Discount Amount :"+((amount*5)/100)+"You hava to pay Amount :"+(amount-(amount*5)/100)));
  		elseif(amount<10000)System.out.println("Discount  10% :"+ "Discount Amount :"+((amount*10)/100)+"You hava to pay Amount :"+(amount-(amount*10)/100)));
		else(amount>=10000)System.out.println("Discount  15% :"+ "Discount Amount :"+((amount*15)/100)+"You hava to pay Amount :"+(amount-(amount*15)/100)));

	


	}
}