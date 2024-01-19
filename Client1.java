Class Parent{
	int x=10;
	Parent(){
	System.out.println("In parent constructor");
	}
	void access(){
	System.out.println("In access method");
	}
}
class Child extends Parent{
    int y=20;
	Child(){
	System.out.println("In Child class");
    System.out.println(y);
    System.out.println(x);
	}
}
class Client1{
	public static void main(String[]args){
	Child obj1=new Child();
	obj1.access();
	//System.out.println(x);
	//System.out.println(y);
	}
}