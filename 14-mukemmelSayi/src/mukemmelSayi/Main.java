package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int sum = 0;

		if (number <= 0) {
			System.out.println("Hatalı girdi");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		String result = sum == number ? "Mükemmel sayı" : "Mükemmel sayı değil";
		System.out.println(result);
	}

}
