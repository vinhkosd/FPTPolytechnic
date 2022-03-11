package Lab6;

import java.util.ArrayList;

public class Bai3 {
	
	public static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			SinhVien sp = new SinhVien();
			sp.nhap(i);
			list.add(sp);
		}
		
		System.out.print("Kiem tra danh sach sinh vien\n");
		
		for(SinhVien sv : list) {
			sv.validate();
		}
	}

}
