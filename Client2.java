class Demo{
	void fun(int x){     // we cannot pass the same datatype variable
	System.out.println(x);
	}
	void fun(int y){
	System.out.println(y);
	}
}
class Client2{
	public static void main(String[]args){
	Demo obj=new Demo();
	obj.fun(10);
	}
}