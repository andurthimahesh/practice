package practice;

public class SortingArray {

	private void ascendingOrder(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

	public static void main(String args[]) {
		int array[] = { 2, 34, 78, 52, 67, 4, 1, 7 };
		SortingArray sorting = new SortingArray();
		sorting.ascendingOrder(array);

	}

}
