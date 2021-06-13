import java.util.Scanner;

//1972019-JeftaBenedictAmpouw
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        System.out.println("## Proses Input Angka ##");
        System.out.print("Input array ke-1: ");
        Array[0] = sc.nextInt();
        System.out.print("Input array ke-2: ");
        Array[1] = sc.nextInt();
        System.out.print("Input array ke-3: ");
        Array[2] = sc.nextInt();
        System.out.print("Input array ke-4: ");
        Array[3] = sc.nextInt();
        System.out.print("Input array ke-5: ");
        Array[4] = sc.nextInt();
        System.out.println("## Angka Hasil Input ##");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Array[i]);
        }
        Arrays.sort(Array);
        System.out.println("## Array setelah diurutkan ##");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Array[i]);
        }
    }
}
