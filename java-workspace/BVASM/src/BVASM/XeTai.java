package BVASM;

public class XeTai extends Xe {
	
	public int taitrong;

	public XeTai() {
		super();
		this.taitrong = 0;
	}

	public XeTai(String mauxe, int tocdo, int taitrong) {
		super(mauxe, tocdo);
		this.taitrong = taitrong;
	}
	
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.printf("Tai trong: %d kg\n", this.taitrong);
	}

}
