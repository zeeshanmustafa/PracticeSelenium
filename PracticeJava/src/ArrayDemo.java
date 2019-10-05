
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 5, 2, 1 } };
		int min = a[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) {// Row

			for (int j = 0; j < 3; j++) {// Column

				if (a[i][j] > min) {

					min = a[i][j];
					mincolumn = j;

				}

			}

		}

		int k = 0;
		int max = a[0][mincolumn];
		while (k < 3) {
			if (a[k][mincolumn] > max) {
				max = a[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);

	}

}
