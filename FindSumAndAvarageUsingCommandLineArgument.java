public class FindSumAndAvarageUsingCommandLineArgument
{
     public static void main(String arg[])
      {
            int variable1=Integer.parseInt(arg[0]),variable2=Integer.parseInt(arg[1]),variable3=Integer.parseInt(arg[2]),sum;
            
            sum=variable1+variable2+variable3;
            System.out.println("sum is :"+ sum + "Avarage is : "+ (sum/3));
      }


}