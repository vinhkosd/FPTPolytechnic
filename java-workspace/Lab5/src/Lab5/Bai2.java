package Lab5;

import java.util.*;

public class Bai2 {

	static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){        
        menu();
        scanner.close();
    }

    public static void menu() {
        System.out.println("1. Nhap danh sach ho ten");
        System.out.println("2. Xuat danh sach ho ten");
        System.out.println("3. Xuat danh sach ngau nhien");
        System.out.println("4. Sap xep danh sach giam dan");
        System.out.println("5. Tim xoa ho ten");
        System.out.println("6. Ket thuc");
        System.out.print("Chon chuc nang:");
        
        int select = scanner.nextInt();
        scanner.nextLine();

        switch(select){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                ngaunhien();
                break;
            case 4:
                sapxep();
                break;
            case 5:
                xoa();
                break;
        }

        if(select <= 5 && select >= 1) {
        	System.out.printf("Chuc nang da chon: %d \n", select);
        	menu();
        } else
        	System.out.print("Ban da chon thoat chuong trinh \n");
    }

    public static void nhap() {
        while(true){
            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();
            list.add(hoTen);
            System.out.print("Nhap them (Y/N)? ");
            if(scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }

    public static void xuat() {
        System.out.printf("Danh sach ho ten \n");
        System.out.printf("So luong: %d \n ", list.size());
        int i = 0;
        System.out.printf("STT\tHo ten \n");
        for(String hoTen : list) {
            i++;
            System.out.printf("%3d\t%s \n", i, hoTen);
        }
    }

    public static void ngaunhien() {
        System.out.printf("Danh sach ho ten \n ");
        Collections.shuffle(list);
        xuat();
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    public static void xoa() {
        System.out.print("Nhap ho ten can tim: ");
        String hoTen = scanner.nextLine();
        if(list.contains(hoTen)) {
        	System.out.printf("Da xoa ten %s khoi danh sach", hoTen);
            list.remove(hoTen);
        } else {
            System.out.printf("Khong tim thay ho ten : %s", hoTen);
        }
        
        xuat();
    }

}
