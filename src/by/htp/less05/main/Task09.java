package by.htp.less05.main;

/*9. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/
import java.util.Scanner;
import java.util.Random;

public class Task09 {

	public static void main(String[] args) {

		int n;
		int positive=0;
		int negative=0;
		int zero=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("Введите количество элементов в последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] mas = new int[n];
		for (int i = 0; i<mas.length; i++) {
			mas[i]=rd.nextInt(100)-50;
			System.out.print(mas[i] + " ");
		}
		
		for (int i = 0; i<mas.length; i++) {
			if (mas[i]<0) {
				negative=negative+1;
			}
			else if (mas[i]>0) {
				positive=positive+1;
			}
			else if (mas[i]==0) {
				zero=zero+1;
			}
		}
		
		System.out.println();
		System.out.println("Количество отрицательных чисел в последовательности: "+ negative);
		System.out.println("Количество положительных чисел в последовательности: "+ positive);
		System.out.println("Количество чисел, равняющихся нулю: "+ zero);

	}

}
