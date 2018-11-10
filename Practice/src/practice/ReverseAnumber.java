package practice;

public class ReverseAnumber {
	public int reverseAnumber(int number) {
		int reverse = 0;
		
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int number = 789;
		ReverseAnumber reverse = new ReverseAnumber();
		 reverse.reverseAnumber(number);
	}

}
