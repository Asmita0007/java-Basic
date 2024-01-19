import java.io.*;
import java.util.*;
class Demo4{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	try{
	int x=sc.nextInt();
	}
	catch(Exception ex){
	System.out.println("handled");
	}
	catch(ArithmeticException ae){
	System.out.println("handled");
	}
	}
}