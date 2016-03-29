package praktikumoop1;

public class PraktikumOOP1 {

    public static void main(String[] args) {
            PraktikumOOP1 praktik = new PraktikumOOP1(); {
            praktik.pembagian(6, 2);
            praktik.perkalian(2, 3);
            praktik.kuadrat(4);
}
        }
    private void pembagian (int a, int b) {
            int hasil;
            hasil = a / b;
            System.out.println(hasil);
    }
   private void perkalian (int a, int b) {
            int hasil;
            hasil = a * b;
            System.out.println(hasil);
   }
   private void kuadrat (int a) {
            int hasil;
            hasil = a * a ;
            System.out.println(hasil);
   }
}
