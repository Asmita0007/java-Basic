class ThisDemo{
     int x=10;

     ThisDemo(){
     System.out.println("X="+ x);
     }

     ThisDemo(int x){
      System.out.println("X="+ x);
     }

	public static void main(String[]args){
	
	ThisDemo obj1=new ThisDemo();
	}
}