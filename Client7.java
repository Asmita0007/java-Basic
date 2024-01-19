class Demo{
	void fun(){
	System.out.println("Hello here in fun");
	}
}
class Child extends Demo{
	void gun(){
	System.out.println("in gun");
	}
}
class Client7{
	public static void main(String[]args){
	Demo obj=new Child();
    
	}
}