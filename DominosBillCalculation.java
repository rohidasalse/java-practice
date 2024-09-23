public class CalculateTotalSellingPrice
{
     public static void main(String [] arg)
	{	
		
		int tvSetValue=32500;
		float profit,sellingPrice,vat,serviceCharge,totalSellingPrice;
		profit=(tvSetValue*27)/100;
		sellingPrice=tvSetValue+profit;
		vat=(sellingPrice*12.7)/100;
		serviceCharge=(sellingPrice*3.87)/100;	
		totalSellingPrice=sellingPrice+vat+serviceCharge;
   		System.out.println("profit :"+profit);
		System.out.println("vat :"+vat);
		System.out.println("serviceCharge :"+serviceCharge);
		System.out.println("totalSellingPrice :"+totalSellingPrice);
		


	}
}