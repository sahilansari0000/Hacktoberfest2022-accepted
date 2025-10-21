import java.util.Scanner;
class ProfitLoss 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost price:-");
		double cp = sc.nextDouble();

		System.out.println("Enter selling price:-");
		double sp = sc.nextDouble();

		double result = sp-cp;
		String PL = (result>=0) ? "Profit" : "Loss" ; 
		System.out.println("You are in "+PL+" of Ruppes:"+result);
	}
}
