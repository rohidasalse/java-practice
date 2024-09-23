public class SumOfDigitUsingCommandLineArgument
{
       public static void main(String arg[])
          {
              int number=Integer.parseInt(arg[0]),lastDigit=(number%10),firstDigit=(number/10);
              System.out.println(number+ " "+ firstDigit + "+" + lastDigit + "=" + (firstDigit+lastDigit));
             
          }
}