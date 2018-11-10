package practice;

public class ReverseAString {
	public String reverse(String name) {
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);

		}

		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mahesh";
		ReverseAString reverse = new ReverseAString();
		 reverse.reverse(name);
	}

}
