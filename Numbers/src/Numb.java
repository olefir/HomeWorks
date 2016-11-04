
public class Numb {

	public static void main(String[] args) {
		// генерация 10 чисел в массив
		// увеличение каждого значения до 10
		// с выводом в консоль

		System.out.println("Производится генерация 10 чисел...");

		int[] numBase = new int[10];

		for (int a = 0; a < 10; a++) {
			numBase[a] = (int) (Math.random() * 10);
		}

		System.out.println("Проверка длины массива...");
		if (numBase.length == 10) {
			System.out.println("Длина верна.");
		} else {
			System.out.println("Длина не верна!");
		}

		System.out.println("Вывод массива...");
		for (int b : numBase) {
			System.out.print(b + " ");
		}

		System.out.println();

		int sum = 0;
		for (int a : numBase) {
			sum += a;
		}
		System.out.println("Сумма чисел массива равняется " + sum);

		System.out.println("Увеличение всех значений на единицу, с пределом в 10");

		for (int a = 0; a < 10; a++) {
			if (numBase[a] != 10) {
				numBase[a]++;
			}

			System.out.print(numBase[a] + " ");
		}

		sum = 0;
		for (int a : numBase) {
			sum += a;
		}
		System.out.println();
		System.out.println("Теперь сумма чисел массива равняется " + sum);

		System.out.println();
		System.out.println("@ Copyright by OLEFIR Vladimir (2015)");
	}

}
