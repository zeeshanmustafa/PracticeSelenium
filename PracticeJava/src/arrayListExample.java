import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Zeeshan");
		a.add("Learn");
		a.add("Selenium");
		a.add("Mustafa");
		System.out.println(a);
		
		a.add(1, "Mustafa");
		System.out.println(a);
		
		//System.out.println(a.get(3));
		//a.remove(3);
		System.out.println(a);
		System.out.println(a.contains("Selenium"));
		System.out.println(a.indexOf("Mustafa"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		

	}

}
