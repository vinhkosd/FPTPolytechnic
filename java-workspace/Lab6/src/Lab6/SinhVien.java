package Lab6;

import java.util.Scanner;

public class SinhVien {
	
	private String hoTen;
	private String SDT;
	private String Email;
	private String CMND;

	public SinhVien() {

	}
	
	public String getSDT() {
		return SDT;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public String getEmail() {
		return Email;
	}
	
	public void nhap(int index) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap ten sinh vien %s:", index != -1 ? ("thu " + index) : "");
		hoTen = scanner.nextLine();
		System.out.printf("Nhap SDT sinh vien %s:", index != -1 ? ("thu " + index) : "");
		SDT = scanner.nextLine();
		System.out.printf("Nhap Email sinh vien %s:", index != -1 ? ("thu " + index) : "");
		Email = scanner.nextLine();
		System.out.printf("Nhap so CMND sinh vien %s:", index != -1 ? ("thu " + index) : "");
		CMND = scanner.nextLine();
	}
	
	public void nhap() {
		nhap(-1);
	}
	
	public String xuat() {
		return String.format("Ho ten: %s\nSDT: %d\n Email: %s\nSo CMND: %s", hoTen, SDT, Email, CMND);
	}
	
	public void validate() {
		String emailRegex = "\\w+@\\w+\\.\\w{1,3}";
		String phoneRegex = "(03|05|07|08|09|01[2|6|8|9])+([0-9]{8})";
		String hoTenRegex = "^[a-zA-Z\\s]+"; 
		String CMNDRegex = "[0-9]{9}";
		boolean emailValidate = Email.matches(emailRegex);
		boolean hoTenValidate = hoTen.matches(hoTenRegex);
		boolean SDTValidate = SDT.matches(phoneRegex);
		boolean CMNDValidate = CMND.matches(CMNDRegex);
		System.out.printf("Ho ten: %s\nSDT: %s\n Email: %s\nSo CMND: %s\n", 
			hoTen + (hoTenValidate ? "\t Trang thai: Hop le" : "\t Trang thai: Khong hop le"),
			SDT + (SDTValidate ? "\t Trang thai:Hop le" : "\t Trang thai: Khong hop le"), 
			Email + (emailValidate ? "\t Trang thai:Hop le" : "\t Trang thai: Khong hop le"), 
			CMND + (CMNDValidate ? "\t Trang thai:Hop le" : "\t Trang thai: Khong hop le")
		);
	}

}
