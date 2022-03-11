package Lab5;

public class SanPham {
	
	private String tenSp;
	private int donGia;
	
	public SanPham(String _tenSp, int _donGia) {
		tenSp = _tenSp;
		donGia = _donGia;
	}
	
	public int getDonGia() {
		return donGia;
	}
	
	public String getTen() {
		return tenSp;
	}
}
