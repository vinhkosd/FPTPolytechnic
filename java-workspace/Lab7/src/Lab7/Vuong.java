package Lab7;

public class Vuong extends ChuNhat {

	public Vuong() {
		super();
	}

	public Vuong(double _canh) {
		super(_canh, _canh);
	}
	
	public void xuat() {
		System.out.printf("Canh: %.2f\n", dai);
		System.out.printf("Chu vi: %.2f\n", getChuVi());
		System.out.printf("Dien tich: %.2f\n", getDienTich());
	}
}
