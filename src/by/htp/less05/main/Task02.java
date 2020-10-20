package by.htp.less05.main;

/*2. В целочисленной последовательности есть нулевые элементы.
 *  Создать массив из номеров этих элементов.*/

public class Task02 {

	public static void main(String[] args) {

		int k = 0;

		int[] mas1 = new int[] { 6, 10, 5, 0, 7, 7, 0, 7, 0, 7 };

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] == 0) {
				k = k + 1;
			}
		}

		int[] mas2 = new int[k];
		int index = 0;

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] == 0) {
				mas2[index] = i;
				System.out.print(mas2[index] + " ");
				index = index + 1;
			}

		}

	}

}
