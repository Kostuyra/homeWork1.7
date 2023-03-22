public class Main {
	public static void main(String[] args) {
		taskOne();
		taskTwo();
		taskThree();
		taskFour();
		taskFive();
		taskSix();
		taskSeven();
		taskEight();
	}

	static void taskOne() {
		System.out.println("Задача 1");
		int saving = 15_000;
		int sum = 0;
		int month = 0;
		while (sum < 2_459_000) {
			sum += saving;
			month += 1;
			System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
		}
	}

	static void taskTwo() {
		System.out.println("Задача 2");
		int i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		for (; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

	static void taskThree() {
		System.out.println("Задача 3");
		int population = 12_000_000;
		int bornOnThousand = 17;
		int diedOnThousand = 8;
		int year = 0;
		while (year < 10) {
			year += 1;
			population += (bornOnThousand - diedOnThousand) * population / 1000;
			System.out.println("Год " + year + ", численность населения составляет " + population);
		}
	}

	static void taskFour() {
		System.out.println("Задача 4");
		double sum = 15_000;
		int month = 0;
		while (sum < 12_000_000) {
			sum += sum * 0.07;
			month++;
			System.out.println("Месяц " + month + " сумма: " + sum);
		}
	}

	static void taskFive() {
		System.out.println("Задача 5");
		double sum = 15_000;
		int month = 0;
		while (sum < 12_000_000) {
			sum += sum * 0.07;
			month++;
			if (month % 6 == 0) {
				System.out.println("Месяц " + month + " сумма: " + sum);
			}
		}
	}

	static void taskSix() {
		System.out.println("Задача 6");
		double sum = 15_000;
		int month = 0;
		while (month < 12 * 9) {
			sum += sum * 0.07;
			month++;
			if (month % 6 == 0) {
				System.out.println("Месяц " + month + " сумма: " + sum);
			}
		}
	}

	static void taskSeven() {
		System.out.println("Задача 7");
		int numberFriday = 6;
		for (int i = 1; i <= 31; i++) {
			if (i % 7 == numberFriday) {
				System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
			}
		}
	}

	static void taskEight() {
		System.out.println("Задача 8");
		int currentYear = 2023;
		for (int i = currentYear - 200; i <= currentYear + 100; i++) {
			if (i % 79 == 0) {
				System.out.println(i);
			}
		}
	}

}