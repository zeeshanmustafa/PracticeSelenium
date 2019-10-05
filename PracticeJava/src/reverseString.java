
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		String S1= "Zeeshan";
		for(int i=S1.length()-1; i>=0; i--) {
			System.out.println(S1.charAt(i));
		}
		//sum of num in array
		
		int sum=0;
		int a[] = {2,3,5,1,7,9};
		
		for(int i = 0; i<a.length; i++) {
			
			//sum+= a[i];
		//checking index of 7
			if(a[i]==7) {
				System.out.println(i);
				break;
			}
		}
		
//System.out.println(sum);
	}

}
