import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no guarnted elemnest will store in sequentail order
		// doesnt accpet duplicate value
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Pakistan");
		hs.add("Pakistan");
		hs.add("Love");
		hs.add("Hello");
		
	//	System.out.println(hs);
		
	/*	System.out.println(hs.remove("Pakistan"));
		
	System.out.println(hs.isEmpty());
		//System.out.println(hs.remove("Pakistan"));
		System.out.println(hs.size());*/
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
			}

}
