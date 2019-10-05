import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Key //Value
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "Hello");
		hm.put(1, "Stranger");
		hm.put(2, "Wondering");
		hm.put(3, "Bye");
		System.out.println(hm.get(2));

		hm.remove(2);
		System.out.println(hm.get(2));

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();

		while (it.hasNext()) {

			Map.Entry mp = (Map.Entry) it.next();// help you print key and value separate
			//System.out.println(mp.getKey());
			//System.out.println(mp.getValue());
			System.out.println(mp);
		}

	}

}
