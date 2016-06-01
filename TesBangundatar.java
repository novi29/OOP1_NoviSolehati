package bangundatar1;

public class TesBangundatar {
    
    public static void main(String [] args) {
        BangunDatar1 b [] = new  BangunDatar1[3];
        
        PersegiPanajang PP = new PersegiPanajang(2, 4);
        Segitiga SG = new Segitiga(2, 6);
        Persegi P = new Persegi(4);
        
        b[0] = PP;
        b[1] = SG;
        b[2] = P;
        
        for (BangunDatar1 b1 : b){
            System.out.println("\n" + b1.displayInfo());
        }
    }
    
}
