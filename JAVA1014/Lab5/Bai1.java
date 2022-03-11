package Lab5;

import java.util.*;

public class Bai1 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        int i = 0;
        Double sumArray = 0.0;
        for(Double d : list) {
            i++;
            sumArray = Double.sum(sumArray, d);
            System.out.printf("Phan tu %d = %f \n ", i, d);
        }

        System.out.printf("Tong cac phan tu = %f \n ", sumArray);
    }
}