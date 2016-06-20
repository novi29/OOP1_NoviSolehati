package arraysatudimensi;

import java.util.Scanner;

public class ArraySatuDimensi {

    public static void main(String[] args) {
        System.out.print("Data apa yang ingin anda inputkan ?   ");
        Scanner z = new Scanner(System.in);
         String data = z.nextLine();
         
          System.out.print("masukkan jumlah " + data + "yang anda inginkan ");
          int nominal = z.nextInt();
        String array[] = new String[nominal];
        for (int i = 0; i < nominal; i++) {
             System.out.print("masukkan " + data + " ke-  " + (i) + " : ");
            array[i] = z.next();

    }
        System.out.println("Selesai");

}
}
