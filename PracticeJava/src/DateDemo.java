import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//Trying to work in visula studio

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/y  hh:mm:ss");
		
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
