package BVASM;

public class XeHoi extends Xe {
	
	public double dungtichbinhxang;

	public XeHoi() {
		super();
		this.dungtichbinhxang = 0;
	}

	public XeHoi(String mauxe, int tocdo, double dungtichbinhxang) {
		super(mauxe, tocdo);
		this.dungtichbinhxang = dungtichbinhxang;
	}

	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.printf("Dung tich binh xang: %.2f l\n", this.dungtichbinhxang);
	}
}
