package Lab5;

import java.util.*;

public class Bai1 {
	public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while(true){
        	System.out.print("Nhap so:");
            Double x = scanner.nextDouble();
            scanner.nextLine();
            list.add(x);
            System.out.print("Nhap them (Y/N)? ");
            if(scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        int i = 0;
        Double sumArray = 0.0;
        for(Double d : list) {
            i++;
            sumArray = Double.sum(sumArray, d);
            System.out.printf("list[%d] = %2f \n", i, d);
        }

        System.out.printf("Tong cac phan tu = %2f \n", sumArray);
        
        scanner.close();
    }
}
