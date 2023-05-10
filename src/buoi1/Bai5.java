package buoi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		List<HocSinh> danhSachHocSinh = new ArrayList<>();

		HocSinh hocSinhA = new HocSinh("123", "Nguyen Van A", 7.8f);
		HocSinh hocSinhB = new HocSinh("1234", "Nguyen Van B", 8.8f);
		HocSinh hocSinhC = new HocSinh("12345", "Nguyen Van C", 5.8f);

		danhSachHocSinh.add(hocSinhA);
		danhSachHocSinh.add(hocSinhB);
		danhSachHocSinh.add(hocSinhC);

		HocSinh hocSinhD = new HocSinh();
		hocSinhD.input();
		hocSinhD.output();
		danhSachHocSinh.add(hocSinhD);

		System.out.print("Nhap xep loai muon xuat: ");
		String xepLoai = scan.nextLine();
		for (HocSinh hocSinh : danhSachHocSinh) {
			if (hocSinh.rank().equals(xepLoai)) {
				hocSinh.output();
			}
		}

		System.out.print("Nhap ma so hoc sinh doi ten: ");
		String maSo = scan.next();
		for (HocSinh hocSinh : danhSachHocSinh) {
			if (hocSinh.getMaSo().equals(maSo)) {
				scan.nextLine();
				System.out.print("Nhap ten muon doi: ");
				String hoTenMoi = scan.nextLine();
				hocSinh.setHoTen(hoTenMoi);
				System.out.println(hocSinh.getHoTen());
				break;
			}
		}

		HocSinh hocSinhMoi = new HocSinh();
		hocSinhMoi.input();

		for (HocSinh hocSinh : danhSachHocSinh) {
			if (hocSinh.getDiemTrungBinh() > hocSinhMoi.getDiemTrungBinh()) {
				hocSinh.output();
				break;
			}
		}
	}
}

class HocSinh {
	String maSo;
	String hoTen;
	float diemTrungBinh;
	Scanner scan = new Scanner(System.in);

	public HocSinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HocSinh(String maSo, String hoTen, float diemTrungBinh) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getMaSo() {
		return maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String rank() {
		if (this.diemTrungBinh == 10f) {
			return "Xuat Xac";
		}
		if (this.diemTrungBinh >= 8) {
			return "Gioi";
		}
		if (this.diemTrungBinh >= 5) {
			return "Kha";
		}
		if (this.diemTrungBinh >= 3) {
			return "Trung Binh";
		}
		return "Yeu";
	}

	public void output() {
		System.out.println("HocSinh [maSo=" + maSo + ", hoTen=" + hoTen + ", diemTrungBinh=" + diemTrungBinh + "]");
	}

	public void input() {
		System.out.print("Nhap ma so: ");
		String maSo = scan.next();
		scan.nextLine();
		System.out.print("Nhap ho ten: ");
		String hoTen = scan.nextLine();
		System.out.print("Nhap diem trung binh: ");
		float diemTrungBinh = scan.nextFloat();
		this.setDiemTrungBinh(diemTrungBinh);
		this.setHoTen(hoTen);
		this.setMaSo(maSo);
	}

}