package by.htp.less05.main;

/*7. Даны действительные числа а1 ,а2 ,..., аn . 
 * Поменять местами наибольший и наименьший элементы.*/
import java.util.Random;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите длинну последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[] mas = new int[n];
		int max = 0;
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(1000) - 500;
			System.out.print(mas[i] + " ");
			if (mas[i] > max) {
				max = mas[i];
			} else if (mas[i] <= min) {
				min = mas[i];
			}
		}
		System.out.println();
		System.out.println("Наибольший элемент последовательности:  "+max);
		System.out.println("Наименьший элемент последовательности:  "+min);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == max) {
				mas[i] = min;
			} else if (mas[i] == min) {
				mas[i] = max;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

}
