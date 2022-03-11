package Lab6;

import java.util.*;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ho va ten:");
		String hoTen = scanner.nextLine();
		String ho = hoTen.substring(0, hoTen.indexOf(" "));
		String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1);
		String dem = hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" "));
		System.out.printf("Ten :%s\n", ten.toUpperCase());
		System.out.printf("Ho :%s\n", ho.toUpperCase());
		System.out.printf("Ten dem :%s\n", dem);
		scanner.close();
	}

}
