class This1{
    int x=10;
    This1(){
     System.out.println(x);
    }
    This1(int x){
    System.out.println(x);
    }
	public static void main(String[]args){
	This1 obj1=new This1();
	This1 obj2=new This1(20);
	}
}