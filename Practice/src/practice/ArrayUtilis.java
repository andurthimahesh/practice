package practice;

public class ArrayUtilis {
	// Divide the given array into even number and odd number array
	public void arryutility(int array[]) {

		int a = 0;
		int b = 0;
		int length1 = 0;
		int length2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				a++;
			} else {
				b++;
			}
		}
		int even[] = new int[a];
		int odd[] = new int[b];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {

				even[length1] = array[i];
				length1++;
			} else {
				odd[length2] = array[i];
				length2++;
			}
		}

		for (int j = 0; j < even.length; j++) {
			System.out.print(even[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < odd.length; j++) {
			System.out.print(odd[j] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 4, 8, 3, 99, 44, 57, 45, 66, 65, 101 };
		ArrayUtilis utilis = new ArrayUtilis();
		utilis.arryutility(array);
	}

}
