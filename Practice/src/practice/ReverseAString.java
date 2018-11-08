package practice;

public class ReverseAString {
	public String reverse(String name) {
		String reverse = "";
		System.out.println("current name :" + name);
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);

		}

		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mahesh";
		ReverseAString reverse = new ReverseAString();
		System.out.println("After Reverse :" + reverse.reverse(name));
	}

}
