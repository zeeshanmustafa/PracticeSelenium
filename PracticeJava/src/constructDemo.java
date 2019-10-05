
public class constructDemo {
	
	public constructDemo() {
		
		System.out.println("I am the construct");
		System.out.println("I am a default constructor");
	}
	
	public void getdata() {
		System.out.println("I am the method");
	}
	
	//Parameter Construct
	public constructDemo(int a, int b) {
		int c;
		c = a+b;
		System.out.println(c);
		
		
	}
	public constructDemo(String str) {
		System.out.println(str);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling default construct
		constructDemo cd = new constructDemo();
		
		//calling parameter construct
		constructDemo c = new constructDemo(4,5);
		
		constructDemo str = new constructDemo("Zeeshan Mustafa");
		
		

	}

}
