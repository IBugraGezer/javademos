package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 17;

		boolean isPrime = true;

		if (number < 2) {
			System.out.println("Hatalı girdi");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		String result = isPrime ? "Asal" : "Asal değil";
		System.out.println(result);
	}

}
