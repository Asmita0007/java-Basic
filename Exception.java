
import java.util.Scanner;
class Exception{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the valid number");
	int number=Integer.parseInt(sc.next());
	System.out.println("Your Entered Number" + number);
	System.out.println("Enter any string");
    String str=sc.next();
	System.out.println(str);
	}
}