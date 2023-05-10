package buoi1;

import java.util.Scanner;

public class Bai2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String maSinhVien;
		String hoTen;
		int tuoi;
		int namSinh;
		float diemTrungBinh;
		
		System.out.print("Nhap ma sinh vien: ");
		maSinhVien = scan.next();
		scan.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = scan.nextLine();
		System.out.print("Nhap tuoi: ");
		tuoi = scan.nextInt();
		System.out.print("Nhap nam sinh: ");
		namSinh = scan.nextInt();
		System.out.print("Nhap diem trung binh: ");
		diemTrungBinh = scan.nextFloat();
		
		System.out.println("Ma sinh vien: " + maSinhVien);
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Tuoi: " + tuoi);
		System.out.println("Nam sinh: " + namSinh);
		System.out.println("Diem trung binh: " + diemTrungBinh);
	}
}
