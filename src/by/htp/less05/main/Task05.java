package by.htp.less05.main;

/*5. Дана последовательность чисел а1 ,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую вcе эти числа.*/
import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		int n;
		int max = 0;
		int min;
		int length;

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите количество элементов в последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		int[] mas = new int[n];
		min = mas[0];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(1000) - 500;

			System.out.print(mas[i] + " ");

			if (mas[i] > max) {
				max = mas[i];
			} else if (mas[i] <= min) {
				min = mas[i];
			}
		}

		length = max - min;
		System.out.println();
		System.out.println("Наибольший элемент последовательности: " + max);
		System.out.println("Наименьший элемент последовательности: " + min);
		System.out.println("Наименьшая длина такой последовательности составляет: " + length);

	}

}
