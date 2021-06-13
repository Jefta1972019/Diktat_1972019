import java.util.Scanner;
//1972019-JeftaBenedictAmpouw
public class EnkapsulasiTimeConvertDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Time;
        EnkapsulasiTimeConvert Convert;
        Convert = new EnkapsulasiTimeConvert();
        System.out.println("=====================================");
        System.out.println("           Time Converter");
        System.out.println("=====================================");
        System.out.println("Input time (second, 0 to exit): ");
        Time = sc.nextInt();
        Convert.setSecond(Time);
        do {    System.out.println(Convert.ShowTime());
            System.out.println("=====================================");
            System.out.println("           Time Converter");
            System.out.println("=====================================");
            System.out.println("Input time (second, 0 to exit): ");
            Time = sc.nextInt();
            Convert.setSecond(Time);
        } while(Time != 0);
        System.out.println("=============THANK YOU==============");
    }
}
