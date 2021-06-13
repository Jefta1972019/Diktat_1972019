import java.util.Scanner;
//1972019-JeftaBenedictAmpouw
public class PengenalanOOPB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Kalimat;
        PengenalanOOPA ReverseWord;
        ReverseWord = new PengenalanOOPA();
        System.out.print("Input kalimat (0 untuk keluar): ");
        Kalimat = sc.next();
        while(Kalimat != "0"){
            System.out.println(ReverseWord.WordReverser(Kalimat));
            System.out.println("Input kalimat (0 untuk keluar): ");
            Kalimat = sc.next();
        }
    }
}
