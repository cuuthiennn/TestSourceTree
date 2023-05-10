package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Mang mang = new Mang();
		mang.input();
		mang.output();
		System.out.println("Trung binh cac so le trong mang la: " + mang.tinhTrungBinhCacSoLe());
		System.out.println("Phan tu lon nhat trong mang la: " + mang.getMaxValueInArray());
		mang.sapXepMangTangDan();
		mang.output();
	}
}

class Mang {
	int soPhanTu;
	int mang[];
	int kichThuocMang;
	Scanner scan = new Scanner(System.in);

	public Mang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mang(int soPhanTu, int[] a, int kichThuocMang) {
		super();
		this.soPhanTu = soPhanTu;
		this.mang = a;
		this.kichThuocMang = kichThuocMang;
	}

	public int getSoPhanTu() {
		return soPhanTu;
	}

	public int[] getMang() {
		return mang;
	}

	public int getKichThuocMang() {
		return kichThuocMang;
	}

	public void setSoPhanTu(int soPhanTu) {
		this.soPhanTu = soPhanTu;
	}

	public void setMang(int[] a) {
		this.mang = a;
	}

	public void setKichThuocMang(int kichThuocMang) {
		this.kichThuocMang = kichThuocMang;
	}

	public void input() {
		System.out.print("Nhap so phan tu cua mang: ");
		int soPhanTu = scan.nextInt();
		int a[] = new int[soPhanTu];
		System.out.println("Nhap mang: ");
		for (int i = 0; i < soPhanTu; i++) {
			System.out.print("Nhap gia tri phan tu: ");
			a[i] = scan.nextInt();
		}
		this.setMang(a);
		this.setKichThuocMang(soPhanTu - 1);
		this.setSoPhanTu(soPhanTu);
	}

	public void output() {
		System.out.println(
				"Mang [soPhanTu=" + soPhanTu + ", mang=" + Arrays.toString(mang) + ", kichThuocMang=" + kichThuocMang);
	}

	public float tinhTrungBinhCacSoLe() {
		float result = 0f;
		int count = 0;
		for (int i = 0; i < this.soPhanTu; i++) {
			if (this.mang[i] % 2 != 0) {
				result += this.mang[i];
				count++;
			}
		}
		return result / count;
	}

	public int getMaxValueInArray() {
		int result = 0;
		for (int i = 0; i < this.soPhanTu; i++) {
			if (result < this.mang[i]) {
				result = this.mang[i];
			}
		}
		return result;
	}

	public void sapXepMangTangDan() {
		int temp;
		for (int i = 0; i <= this.kichThuocMang - 1; i++) {
			for (int j = i + 1; j <= this.kichThuocMang; j++) {
				if (this.mang[i] > this.mang[j]) {
					temp = this.mang[i];
					this.mang[i] = this.mang[j];
					this.mang[j] = temp;
				}
			}
		}
	}
}