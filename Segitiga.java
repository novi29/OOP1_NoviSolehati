package bangundatar1;
public class Segitiga implements BangunDatar1 {
        private final double alas, tinggi;
        
        public Segitiga(double a, double t) {
    alas = a;
    tinggi = t;
}
public double getalas () {
    return alas;
}
public double gettinggi () {
    return tinggi;
}

    @Override
    public double Luas() {
     return (0.5 * (alas * tinggi));
    }

    @Override
    public double Keliling() {
        double d;
        d = (double)Math.sqrt((alas * alas) + (tinggi * tinggi));
      return ((alas * alas) + (tinggi * tinggi));
    }

    @Override
    public String displayInfo() {
    return (" Segitiga "
              + "\no alas : " + (float) getalas()
            + "\no tinggi : " + (float) gettinggi () 
             + "\no Luas : " + (float) Luas ()
             + "\no Keliling : " + (float) Keliling () );
    }
    
}
