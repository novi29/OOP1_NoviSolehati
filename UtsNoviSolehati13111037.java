package utsnovisolehati13111037;

import java.util.Scanner;

public class UtsNoviSolehati13111037 {

    public static double rata_rata;
    public static double ip;
    public static int jmlLulus = 0;
    public static int jmlTidakLulus = 0;
    public static int jmlData;
    double[] nilai = new double[100];

    public void HitungRata_rata() {

        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jml = input.nextDouble();

        double sum = 0;
        for (int i = 1; i <= jml; i++) {

            System.out.println("Nilai IPK " + i + ": ");
            nilai[i] = input.nextDouble();

            sum += nilai[i];

        }

        rata_rata = sum / jml;
        int jmls = (int) (jml);

        System.out.println("Total nilai: " + " " + sum);
        System.out.println("IP:" + rata_rata);

        if (rata_rata >= 2.75 && rata_rata <= 4.00) {
            System.out.println("Lulus");
        } else {
            System.out.println("Data IP tidak valid");
        }

    }

    public void NilaiAkhir() {
        for (int i = 1; i <= rata_rata; i++) {
            if (rata_rata >= 2.75 && rata_rata <= 4.00) {
                jmlLulus = jmlLulus + 1;

            } else {
                jmlTidakLulus = jmlTidakLulus + 1;

            }
        }

    }

    public void Panggil() {
        System.out.println("Jumlah Mahasiswa yang  Lulus : " + jmlLulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus : " + jmlTidakLulus);
    }

    public static void main(String[] args) {
        UtsNoviSolehati13111037 proses = new UtsNoviSolehati13111037();
        proses.HitungRata_rata();
        proses.NilaiAkhir();
        proses.Panggil();

    }

}
