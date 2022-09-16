package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'a';
		harf = Character.toLowerCase(harf);

		char[] inceSesliHarfler = { 'e', 'i', 'ö', 'ü' };
		char[] kalinSesliHarfler = { 'a', 'ı', 'o', 'u' };

		for (int i = 0; i < 4; i++) {
			char inceHarf = inceSesliHarfler[i];
			char kalinHarf = kalinSesliHarfler[i];

			if (harf == inceHarf) {
				System.out.println("İnce harf");
				return;
			} else if (harf == kalinHarf) {
				System.out.println("Kalın harf");
				return;
			}
		}

		System.out.println("Sesli harf değil");
	}

}
