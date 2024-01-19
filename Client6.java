class Parent{
	int x=10;
	static int y=20;
	Parent(){
	System.out.println("In parent constructor");
	}
}
class Child extends Parent{
	int x=30;
	static int y=40;
	Child(){
	System.out.println("In child constructor");
	}

	void access(){
		//super();
	System.out.println(super.x);
	System.out.println(super.y);
	System.out.println(x);
	System.out.println(y);
	System.out.println("In ACESS");
	}
}
class Client6{
	public static void main(String[]args){
    Child obj=new Child();
    obj.access();
	}
}