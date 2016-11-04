
public class Numb {

	public static void main(String[] args) {
		// ��������� 10 ����� � ������
		// ���������� ������� �������� �� 10
		// � ������� � �������

		System.out.println("������������ ��������� 10 �����...");

		int[] numBase = new int[10];

		for (int a = 0; a < 10; a++) {
			numBase[a] = (int) (Math.random() * 10);
		}

		System.out.println("�������� ����� �������...");
		if (numBase.length == 10) {
			System.out.println("����� �����.");
		} else {
			System.out.println("����� �� �����!");
		}

		System.out.println("����� �������...");
		for (int b : numBase) {
			System.out.print(b + " ");
		}

		System.out.println();

		int sum = 0;
		for (int a : numBase) {
			sum += a;
		}
		System.out.println("����� ����� ������� ��������� " + sum);

		System.out.println("���������� ���� �������� �� �������, � �������� � 10");

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
		System.out.println("������ ����� ����� ������� ��������� " + sum);

		System.out.println();
		System.out.println("@ Copyright by OLEFIR Vladimir (2015)");
	}

}
