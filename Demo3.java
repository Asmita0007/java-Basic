class Demo3{
	public static void main(String[]args){
	System.out.println("Start main");
	try{
	  System.out.println(10/0);
	}catch(ArithmeticException ae){
	System.out.println("Exception occured");

	}
	System.out.println("End Main");
	}
}