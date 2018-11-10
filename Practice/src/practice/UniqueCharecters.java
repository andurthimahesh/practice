package practice;

public class UniqueCharecters {
	public boolean uniqueUttility(String value) {
		char letter;
		char letters[] = value.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			for (int j = i + 1; j < letters.length; j++) {
				if (letters[i] == letters[j]) {
					return false;
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String animal = "elephant";
		UniqueCharecters unique = new UniqueCharecters();
		unique.uniqueUttility(animal);
	}

}
