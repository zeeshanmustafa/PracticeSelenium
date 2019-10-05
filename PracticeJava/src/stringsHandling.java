
public class stringsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// payment $100 paid
		//Check the string above and validate if $ value is exsist or not
		
		String str= "payment $100 paid";
		System.out.println(str.charAt(8));
		
		String str1= new String("payment $100 paid");
	System.out.println(str1.indexOf("$"));
		System.out.println(str1.substring(8));
	}

}
