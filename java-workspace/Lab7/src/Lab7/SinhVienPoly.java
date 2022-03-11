package Lab7;

public abstract class SinhVienPoly {
	
	public String hoTen;
	public String nganh;

	public SinhVienPoly() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public double getDiem();
	
	public String getHocLuc() {
		double diem = getDiem();
		if (diem < 5.0) 
			return "Yeu";
		else if (diem < 6.5)
			return "Trung binh";
		else if (diem < 7.5)
			return "Kha";
		else if (diem < 9)
			return "Gioi";
		else
			return "Xuat sac";
	}
	
	public void xuat() {
		System.out.print("THONG TIN SINH VIEN");
		System.out.printf("Ho ten: %s\n", hoTen);
		System.out.printf("Nganh hoc: %s\n", nganh);
		System.out.printf("Diem: %.2f\n", getDiem());
		System.out.printf("Hoc luc: %s\n", getHocLuc());
	}
}
