package practice;

public class RemoveAnyCharecter {
	public void removeutility(String value, char letter) {
		char letters = 0;
		char charecter[] = value.toCharArray();
		for (int i = 0; i < charecter.length; i++) {
			if (charecter[i] != letter) {
				letters=charecter[i];
				System.out.print(letters);
			}
		}
	}

	public static void main(String[] args) {
		String value = "mainmethod";
		char letter = 'm';
		RemoveAnyCharecter remove = new RemoveAnyCharecter();
		remove.removeutility(value, letter);

	}

}
