package novisolehatihitunganbulan;

public class Bulan {

    int bln, mngg, hr, jm, mnit;

    public Bulan() {
    }

    Bulan(int bln, int mngg, int hr, int jm, int mnit) {
        this.bln = bln;
        this.mngg = mngg;
        this.hr = hr;
        this.jm = jm;
        this.mnit = mnit;

    }

    public int getBln() {
        return bln;
    }

    public void setBln(int bln) {
        this.bln = bln;
    }

    public int getMngg() {
        return mngg;
    }

    public void setMngg(int mngg) {
        this.mngg = mngg;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getJm() {
        return jm;
    }

    public void setJm(int jm) {
        this.jm = jm;
    }

    public int getMnit() {
        return mnit;
    }

    public void setMnit(int mnit) {
        this.mnit = mnit;
    }

    int convertBulanToMinggu(int Bulan) {
        int Minggu;
        Minggu = Bulan * 4;
        return Minggu;
    }

    int convertBulanToHari(int Bulan) {
        int Hari;
        Hari = Bulan * 30;
        return Hari;
    }

    int convertBulanToJam(int Bulan) {
        int Jam;
        Jam = Bulan * 720;
        return Jam;
    }
    int convertBulanToMenit(int Bulan) {
        int Menit;
        Menit = Bulan * 43200;
        return Menit;
    }
    int convertBulanToDetik(int Bulan) {
        int Detik;
        Detik = Bulan * 2592000;
        return Detik;
    }
}
