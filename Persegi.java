package bangundatar1;

public class Persegi implements BangunDatar1{
    private final double sisi;
    
    public Persegi(double s) {
    sisi = s;
}
    public double getSisi () {
    return sisi;
}

    @Override
    public double Luas() {
    return (sisi * sisi);
    }

    @Override
    public double Keliling() {
    return (4 * sisi);
    }

    @Override
    public String displayInfo() {
      return (" Persegi "
              + "\no Sisi : " + (float) getSisi()
             + "\no Luas : " + (float) Luas ()
             + "\no Keliling : " + (float) Keliling () );
    }

    
}
