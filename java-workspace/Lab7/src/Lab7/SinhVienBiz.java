package Lab7;

public class SinhVienBiz extends SinhVienPoly {
	
	double diemMarketing;
	double diemSales;

	public SinhVienBiz(String _hoTen, double _diemMarketing, double _diemSales) {
		hoTen = _hoTen;
		diemMarketing = _diemMarketing;
		diemSales = _diemSales;
		nganh = "Biz";
	}

	@Override
	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}

}
