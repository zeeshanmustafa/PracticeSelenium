
public class superChild extends superParent {

	
	String name = "Selenium";//Creted local String
	
	public void getString() {
		
		System.out.println(name);//will print local String 
		System.out.println(super.name);//will print inherti class String name
	}
	
	public superChild() {
		//should alway be in the first line when using 
		//super constructor
		super();// invoke the parent class constructor
		System.out.println("I am child constructor");
		
		
	}
	public void getData() {
		System.out.println("I am child class");//will rint local method
		
		super.getData();// will print parent class method
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		superChild gs = new superChild();
		
		gs.getString();
		gs.getData();

	}

}
