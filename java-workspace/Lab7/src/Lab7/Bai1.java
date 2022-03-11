package Lab7;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao chieu dai:");
		double dai = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Nhap vao chieu rong:");
		double rong = scanner.nextDouble();
		System.out.print("Nhap vao canh hinh vuong:");
		double canh = scanner.nextDouble();
		scanner.nextLine();
		ChuNhat cn = new ChuNhat(dai, rong);
		Vuong vu = new Vuong(canh);
		cn.xuat();
		vu.xuat();
		scanner.close();
	}
}
