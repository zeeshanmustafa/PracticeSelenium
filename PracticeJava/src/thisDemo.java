
public class thisDemo {

	int z = 3;

	public void getdata() {
		int z = 10;
		int a = z+this.z;

		System.out.println(z);//will print local
		System.out.println(this.z);//will get global int
	
		System.out.println(a);//will print global and local sum

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo td = new thisDemo();

		td.getdata();
	}

}
