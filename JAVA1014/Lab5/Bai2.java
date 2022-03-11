package Lab5;

import java.util.*;

public class Bai2 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<Double>();
        
        menu();
        scanner.close()
    }

    public static void menu() {
        System.out.print("1. Nhap danh sach ho ten");
        System.out.print("2. Xuat danh sach ho ten");
        System.out.print("3. Xuat danh sach ngau nhien");
        System.out.print("4. Sap xep danh sach giam dan");
        System.out.print("5. Tim xoa ho ten");
        System.out.print("6. Ket thuc");
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
                xuat();
                break;
            case 5:
                xoa();
                break;
        }

        if(select <= 5 && select >= 1) 
            menu();
    }

    public static void nhap() {
        while(true){
            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();
            list.add(hoTen);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
    }

    public static void xuat() {
        System.out.printf("Danh sach ho ten \n ");
        int i = 0;
        for(String hoTen : list) {
            i++;
            System.out.printf("list[%d] = %s \n ", i, hoTen);
        }
    }

    public static void ngaunhien() {
        System.out.printf("Danh sach ho ten \n ");
        int i = 0;
        Collections.shuffle(list);
        for(String hoTen : list) {
            i++;
            System.out.printf("list[%d] = %s \n ", i, hoTen);
        }
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public static void xoa() {
        System.out.print("Nhap ho ten can tim: ");
        String hoTen = scanner.nextLine();
        if(list.indexOf(hoTen)) {
            list.remove(hoTen);
        } else {
            System.out.printf("Khong tim thay ho ten : %s", hoTen);
        }
    }
}