package maksmin;

import java.util.Scanner;

public class MaksMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valid=0;
        double ip;
        MaksMin range = new MaksMin();
        ip = input.nextDouble();

        while (ip != -999) {
            ip = input.nextDouble();
            if (isWithinRange(ip, 0, 4)== 1){
                valid++;
                
            }
        }
    }
int isWithinRange(float X, float min, float max){
}
