package novisolehatihitunganbulan;

public class NoviSolehatiHitunganBulan {

    public static void main(String[] args) {
        Bulan hari = new Bulan();
        Bulan hari1 = new Bulan(1, 4, 7, 24, 60);

        System.out.println("12 Bulan adalah " + hari.convertBulanToMinggu(12) + " minggu");
        System.out.println("2 Bulan adalah " + hari.convertBulanToHari(2) + " hari");
        System.out.println("2 Bulan adalah " + hari.convertBulanToJam(2) + " jam");
        System.out.println("1 Bulan adalah " + hari.convertBulanToMenit(1) + " menit");
        System.out.println("2 Bulan adalah " + hari.convertBulanToDetik(2) + " detik");
    }

}
