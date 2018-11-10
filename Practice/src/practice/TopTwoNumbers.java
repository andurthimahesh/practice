package practice;

public class TopTwoNumbers {

	public void topMaxNumbers(int array[]) {
		int first = 0;
		int second = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > first) {
				second = first;
				first = array[i];
			} else if (array[i] > second) {
				second = array[i];
			}

		}
		System.out.println(first + " " + second);

	}

	public static void main(String[] args) {
		int ar[] = { 333, 5, 6, 22, 66, 77 };
		TopTwoNumbers max = new TopTwoNumbers();
		max.topMaxNumbers(ar);

	}

}
