class Parent{
	Parent(){
	System.out.println("In parent constructor");
	}
	void parentProperty(){
	System.out.println("In parent property");
	}
}
class Child extends Parent{
     Child(){
     System.out.println("in child constructor");
     }
}
class PaC{
	public static void main(String[]args){
	Child obj1=new Child();
	obj1.parentProperty();
	}
}