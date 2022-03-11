package Lab7;

public class SinhVien extends SinhVienPoly {
	
	double diem;

	public SinhVien(String _hoTen, String _nganh, double _diem) {
		hoTen = _hoTen;
		nganh = _nganh;
		diem = _diem;
	}

	@Override
	public double getDiem() {
		return diem;
	}
	
	public void printInLine() {
		System.out.printf("%6s\t", hoTen);
		System.out.printf("%5s\t", nganh);
		System.out.printf("%4.2f\t", getDiem());
		System.out.printf("%7s", getHocLuc());
	}
}
