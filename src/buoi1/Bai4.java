package buoi1;

import java.util.Scanner;

public class Bai4 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[][];
		int m;
		int n;
		int tong = 0;
		System.out.print("Nhap so luong dong: ");
		m = scan.nextInt();
		System.out.print("Nhap so luong dong: ");
		n = scan.nextInt();
		a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int value = (int) (Math.random() * 100);
				a[i][j] = value > 50 ? value - 50 : value;
				tong += value;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Tong cac phan tu trong mang: " + tong);
	}
}
