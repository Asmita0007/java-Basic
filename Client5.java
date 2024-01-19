class ICC{
	ICC(){
	 System.out.println("In ICC");
	}
}
class BCCI extends ICC{
	BCCI(){
	System.out.println("BCCI");
	}
}
class Client5{
	public static void main(String[]args){
     BCCI obj=new BCCI();
	}
}