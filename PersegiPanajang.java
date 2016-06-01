package bangundatar1;
public class PersegiPanajang implements BangunDatar1{
private final double panjang, lebar;

public PersegiPanajang(double p, double l) {
    panjang = p;
    lebar = l;
}
public double getPanjang () {
    return panjang;
}
public double getLebar () {
    return lebar;
}

    @Override
    public double Luas() {
        return (panjang * lebar);
    }

    @Override
    public double Keliling() {
    return (2 * (panjang + lebar) );
    }

    @Override
    public String displayInfo() {
     return (" Persegi panjang"
             + "\no Panjang : " + (float) getPanjang ()
             + "\no Lebar : " + (float )getLebar ()
             + "\no Luas : " + (float) Luas ()
             + "\no Keliling : " + (float) Keliling () );
    }

    
}
