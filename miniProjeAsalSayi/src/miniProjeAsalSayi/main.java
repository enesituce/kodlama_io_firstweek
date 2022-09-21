package miniProjeAsalSayi;

public class main {

	public static void main(String[] args) {

		int number = 80;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("sayı asal değildir.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime == true) {
			System.out.println(" sayı asaldır");
		}

		else {
			System.out.println("sayı asal değildir");
		}

	}

}
