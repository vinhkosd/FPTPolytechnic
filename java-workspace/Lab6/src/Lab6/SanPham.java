package Lab6;

import java.util.Scanner;

public class SanPham {

	private String tenSp;
	private int donGia;
	private String hang;
	
	public SanPham() {
		
	}
	
	public SanPham(String _tenSp, int _donGia, String _hang) {
		tenSp = _tenSp;
		donGia = _donGia;
		hang = _hang;
	}
	
	public int getDonGia() {
		return donGia;
	}
	
	public String getTen() {
		return tenSp;
	}

	public String getHang() {
		return hang;
	}
	
	public void nhap(int index) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap ten san pham %s:", index != -1 ? ("thu " + index) : "");
		tenSp = scanner.nextLine();
		System.out.printf("Nhap gia san pham %s:", index != -1 ? ("thu " + index) : "");
		donGia = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("Nhap hang san pham %s:", index != -1 ? ("thu " + index) : "");
		hang = scanner.nextLine();
	}
	
	public void nhap() {
		nhap(-1);
	}
	
	public String xuat() {
		return String.format("Ten sp %s\nDon gia %d\n Hang san xuat: %s\n", tenSp, donGia, hang);
	}
}
