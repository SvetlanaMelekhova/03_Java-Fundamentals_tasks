package by.htp.less05.main;

/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, 
которые кратны данному К.*/
import java.util.Scanner;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

		int k;
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите длину массива:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		System.out.print("Введите делитель:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(1000);
			System.out.print(A[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < A.length; i++) {
			if (A[i] % k == 0) {

				sum = sum + A[i];
				System.out.print(A[i] + " ");
			}
		}

		System.out.println();
		System.out.println("Сумма элементов массива кратных \"" + k + "\" = " + sum);
	}

}
