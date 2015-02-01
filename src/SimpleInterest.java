import java.util.Scanner;


public class SimpleInterest {

	public static void main(String[] args) {
	double principal;
	//the value of the investment
	double rate;
	//the annual interest rate
	double interest;
	//the interest earned during the year
	int time=5;
	//total time
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the initial investment: ");
	principal= scanner.nextDouble();
	System.out.println("Enter the annual interest rate");
	rate = scanner.nextDouble();
	interest = principal*time*rate/100;
	double amount = principal+interest;
	System.out.println("The value of investment after five years " + amount);
	}

}
