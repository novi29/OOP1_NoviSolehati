package tugasmethodprosedur;
import javax.swing.JOptionPane;

public class TugasMethodProsedur {

    public static void main(String[] argas) {
    String n1String, n2String;
        int n1Int, n2Int;
        
        n1String = JOptionPane.showInputDialog("Masukan Nilai 1 : ");
        n1Int = Integer.parseInt(n1String);
        n2String = JOptionPane.showInputDialog("Masukan Nilai 2 : ");
        n2Int = Integer.parseInt(n2String);

    }
    public static void Pembagi(int a, int b) {
        int hsl = 0;
        hsl = a / b;
        System.out.println("Hasil  Pembagian : "+ hsl);
    }
}
