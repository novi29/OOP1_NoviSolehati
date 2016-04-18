package utsscannernovisolehati;
import java.util.Scanner;

public class UtsScannerNoviSolehati {

    public static void main(String[] args) {
        int A,i,Masukan;
    int maks = 1000;
    int min = 1000;
    int jml =1;
    char pil;
     Scanner inputan=new Scanner(System.in);
        A = inputan.nextInt();
        pil = inputan.next().charAt(0);
        
        if (pil == 'X'){
        for (i=0; i<A; i++){
            Masukan = inputan.nextInt();
            if (Masukan <= min){
                if (Masukan == min){
                    jml++;
                }
                min = Masukan;
                }
        }

    }
        System.out.println("Output : " + min);
    System.out.println("Output : " + jml);
    
}
}
