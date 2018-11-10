package practice;

public class ReplaceACharecter {
	public void replaceutilis(String name, String replace) {

		String id = name.replaceAll(" ", "%20");
		System.out.println(id);

	}

	public void manual(String name, String replace) {
		String value = "";
		String[] name1 = name.split(" ");
		for (int i = 0; i < name1.length; i++) {
			value = name1[i] + "%20";

		}
	}

	public static void main(String[] args) {
		String name = "java is a platform Independent";
		String replace = "%20";
		ReplaceACharecter utilis = new ReplaceACharecter();
		utilis.replaceutilis(name, replace);
		utilis.manual(name, replace);

	}

}
