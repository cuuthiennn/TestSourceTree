package buoi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		int soLuongPhanTu;
		System.out.print("Nhap so luong phan tu: ");
		soLuongPhanTu = scan.nextInt();
		while (soLuongPhanTu > 0) {
			System.out.print("Nhap gia tri phan tu: ");
			int value = scan.nextInt();
			array.add(value);
			soLuongPhanTu--;
		}
		array.forEach(item -> System.out.print(item + " "));
		int maxValue = array.get(0);
		for (Integer integer : array) {
			if (maxValue < integer) {
				maxValue = integer;
			}
		}
		System.out.println("Phan tu lon nhat: " + maxValue);
	}
}
