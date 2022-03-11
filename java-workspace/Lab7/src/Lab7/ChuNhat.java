package Lab7;

public class ChuNhat {
	
	public double dai;
	public double rong;

	public ChuNhat() {
		dai = 1;
		rong = 1;
	}
	
	public ChuNhat(double _dai,double  _rong) {
		dai = _dai;
		rong = _rong;
	}
	
	public double getChuVi() {
		return (dai+rong)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public void xuat() {
		System.out.printf("Chieu dai: %.2f\n", dai);
		System.out.printf("Chieu rong: %.2f\n", rong);
		System.out.printf("Chu vi: %.2f\n", getChuVi());
		System.out.printf("Dien tich: %.2f\n", getDienTich());
	}
}
