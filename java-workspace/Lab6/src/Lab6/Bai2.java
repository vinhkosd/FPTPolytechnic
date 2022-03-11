package Lab6;

import java.util.ArrayList;

public class Bai2 {
	
	public static ArrayList<SanPham> list = new ArrayList<SanPham>();

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			SanPham sp = new SanPham();
			sp.nhap(i);
			list.add(sp);
		}
		
		System.out.print("Cac san pham co ten hang la Nokia\n");
		
		for(SanPham sp : list) {
			if(sp.getHang().equals("Nokia")) {
				System.out.print(sp.xuat());
			}
		}
	}

}
