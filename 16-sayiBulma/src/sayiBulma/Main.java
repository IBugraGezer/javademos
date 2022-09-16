package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int toFound = 2;
		boolean isExists = false;

		for (int number : numbers) {
			if (number == toFound) {
				isExists = true;
				break;
			}
		}

		System.out.println(isExists ? "Sayı var" : "Sayı yok");
	}

}
