
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean runAgain= true;
		while (runAgain) {
		System.out.println("Choose an Operator; Addition, Subtraction, Multiplication, Division, Modulo");
		System.out.println("Type Here:");
		Scanner sc= new Scanner(System.in);
		String operator= sc.nextLine();
		System.out.println("Input First Number:");
		double first=sc.nextDouble();
		System.out.println("Input Second Number");
		double second=sc.nextDouble();
		double result;
		switch(operator) {
		case "Addition":
			result= first+second;
			System.out.println(result);
			break;
		case "Subtraction":
			result= first-second;
			System.out.println(result);
			break;
		case "Multiplication":
			result= first*second;
			System.out.println(result);
			break;
		case "Division":
			result= first/second;
			System.out.println(result);
			break;
		case "Modulo":
			result= first%second;
			System.out.println(result);
			break;
		}
	System.out.println("Would you like to use the calculator again.. Input Integer?(1(yes)/2(no)");
	
	int answer=sc.nextInt();
	
	if (answer==1) {
		runAgain=true;
	} else {
		runAgain=false;
	}
	}

}
}
