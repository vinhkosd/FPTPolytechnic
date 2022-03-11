package Lab7;

public class SinhVienIT extends SinhVienPoly {
	
	
	double diemJava;
	double diemCss;
	double diemHtml;

	public SinhVienIT(String _hoTen, double _diemJava, double _diemCss, double _diemHtml) {
		hoTen = _hoTen;
		diemJava = _diemJava;
		diemCss= _diemCss;
		diemHtml = _diemHtml;
		nganh = "IT";
	}

	@Override
	public double getDiem() {
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}

}
