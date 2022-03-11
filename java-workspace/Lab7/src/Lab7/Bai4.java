package Lab7;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai4 {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

	public static void main(String[] args) {
		menu();
		scanner.close();
	}
	
	public static void menu() {
		System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat thong tin sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Thoat chuong trinh");

        System.out.print("Chon chuc nang:");
        
        int select = scanner.nextInt();
        scanner.nextLine();
        
        switch(select){
	        case 1:
	            Nhap();
	            break;
	        case 2:
	        	Xuat();
	            break;
	        case 3:
	        	SvGioi();
	            break;
	        case 4:
	        	sapxep();
	            break;
	    }
        
        if(select <= 4 && select >= 1) {
        	System.out.printf("Chuc nang da chon: %d \n", select);
        	menu();
        } else
        	System.out.print("Ban da chon thoat chuong trinh \n");
	}
	
	public static void Nhap() {
		System.out.print("Nhap vao ten sinh vien:");
		String hoTen = scanner.nextLine();
		System.out.print("Nhap nganh sinh vien:");
		String nganh = scanner.nextLine();
		
		System.out.print("Nhap diem:");
		int diem = scanner.nextInt();
		scanner.nextLine();
		SinhVien sp = new SinhVien(hoTen, nganh, diem);
		list.add(sp);
		
		 System.out.print("Nhap them (Y/N)? ");
         if(!scanner.nextLine().equalsIgnoreCase("N")){
        	 Nhap();
         }
	}
	
	public static void Xuat() {
        System.out.printf("Danh sach sinh vien \n");
        System.out.printf("So luong: %d \n ", list.size());
        int i = 0;
        System.out.printf("STT\tHo ten\tNganh\tDiem\tHoc Luc \n");
        for(SinhVien sv : list) {
            i++;
            System.out.printf("%3d", i);
            sv.printInLine();
            System.out.println();
        }
    }
	
	public static void sapxep() {
		Comparator<SinhVien> comp = new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return Double.compare(o1.diem, o2.diem);
			}
		};
        Collections.sort(list, comp);
        Collections.reverse(list);
        Xuat();
    }
	
	public static void SvGioi() {
		System.out.printf("Danh sach sinh vien gioi \n");
        int i = 0;
        System.out.printf("STT\tHo ten\tNganh\tDiem\tHoc Luc \n");
        for(SinhVien sv : list) {
            
            if(sv.getHocLuc() == "Gioi") {
            	i++;
            	System.out.printf("%3d", i);
                sv.printInLine();
                System.out.println();
            }
            
            
        }
    }

}
