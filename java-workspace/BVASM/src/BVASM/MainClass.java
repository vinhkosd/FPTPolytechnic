package BVASM;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Xe> list = new ArrayList<Xe>();
		list.add(new XeHoi("Honda", 200, 38));
		list.add(new XeHoi("Toyota", 180, 42));
		list.add(new XeTai("KIA", 140, 1250));
		for(Xe xe : list) {
			xe.xuatThongTin();
		}
	}

}
