class ICC{
	ICC(){
	System.out.println("In ICC");
	}
}
class BCCI extends ICC{
	BCCI(){
	System.out.println("In BCII");
	}
}
class Client{
	public static void main(String[]args){
    BCCI obj=new BCCI();
	}
}