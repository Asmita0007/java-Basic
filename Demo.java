class Demo{
	void m1(){
		System.out.println("in m1");
		System.out.println(10/0);// as here is the exception then remaining block thats m2 cant execute
		m2();
	}
	void m2(){
		System.out.println("in m2");
	}
	public static void main(String[]args){
	System.out.println("Start main");
	Demo obj=new Demo();
	obj.m1();
	}
}