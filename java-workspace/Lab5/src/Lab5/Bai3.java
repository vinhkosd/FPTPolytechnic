package Lab5;

import java.util.*;

public class Bai3 {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<SanPham> list = new ArrayList<SanPham>();

	public static void main(String[] args) {
		menu();
		scanner.close();
	}
	
	public static void menu() {
		System.out.println("0. Thoat chuong trinh");
		System.out.println("1. Nhap danh sach san pham");
        System.out.println("2. Xuat danh sach san pham giam dan");
        System.out.println("3. Tim xoa san pham theo ten");
        System.out.println("4. Xuat gia trung binh cua san pham");

        System.out.print("Chon chuc nang:");
        
        int select = scanner.nextInt();
        scanner.nextLine();
        
        switch(select){
	        case 1:
	            nhapSp();
	            break;
	        case 2:
	        	sapxep();
	            break;
	        case 3:
	            xoa();
	            break;
	        case 4:
	            xuatGiaTrungBinh();
	            break;
	    }
        
        if(select <= 5 && select >= 1) {
        	System.out.printf("Chuc nang da chon: %d \n", select);
        	menu();
        } else
        	System.out.print("Ban da chon thoat chuong trinh \n");
	}
	
	public static void nhapSp() {
		System.out.print("Nhap vao ten sp:");
		String tenSp = scanner.nextLine();
		System.out.print("Nhap don gia sp:");
		int donGia = scanner.nextInt();
		scanner.nextLine();
		SanPham sp = new SanPham(tenSp, donGia);
		list.add(sp);
		
		 System.out.print("Nhap them (Y/N)? ");
         if(!scanner.nextLine().equalsIgnoreCase("N")){
             nhapSp();
         }
	}
	
	public static void xuat() {
        System.out.printf("Danh sach ho ten \n");
        System.out.printf("So luong: %d \n ", list.size());
        int i = 0;
        System.out.printf("STT\tTen san pham\t donGia \n");
        for(SanPham sp : list) {
            i++;
            System.out.printf("%3d\t%12s\t%d\n", i, sp.getTen(), sp.getDonGia());
        }
    }
	
	public static void sapxep() {
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham o1, SanPham o2) {
				return Integer.compare(o1.getDonGia(), o2.getDonGia());
			}
		};
        Collections.sort(list, comp);
        Collections.reverse(list);
        xuat();
    }
	
	public static void xoa() {
        System.out.print("Nhap ten sp can tim xoa: ");
        String tenSp = scanner.nextLine();
        boolean found = false;
        for(SanPham sp : list) {
            if (sp.getTen().equalsIgnoreCase(tenSp)) {
            	System.out.printf("Da xoa ten %s khoi danh sach\n", sp.getTen());
            	list.remove(sp);
            	found = true;
            	break;
            }
        }
        
        if(!found) {
        	System.out.printf("Khong tim thay ten sp : %s\n", tenSp);
        }
    }
	
	public static void xuatGiaTrungBinh() {
		double tongDonGia = 0.0;
		for(SanPham sp : list) {
			tongDonGia = Double.sum(tongDonGia, sp.getDonGia());
        }
		
		 System.out.printf("Gia trung binh cua cac sp = %f \n", tongDonGia/list.size());
	}
}
