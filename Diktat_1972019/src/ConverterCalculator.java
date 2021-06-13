//1972019-JeftaBenedictAmpouw
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class ConverterCalculator {
    String Number;
    int Num,i,Rdx;

    public static String regex = "\\A[01]+\\Z";

    public static String convertToBinary(int Num) {
        return coreConverterFromDecimal(Num, 2);
    }
    public static String convertToHexa(int Num){
        return coreConverterFromDecimal(Num,16);
    }

    public static String convertToOctal(int Num){
        return coreConverterFromDecimal(Num,8);
    }

    public static int convertBinaryToDecimal(String Num){
        return coreConverterToDecimal(Num,2);
    }

    public static int convertHexaToDecimal(String Num){
        return coreConverterToDecimal(Num,16);
    }

    public static String coreConverterFromDecimal(int Num, int Rdx){
        if(Rdx== 16){
            return Integer.toHexString(Num);
        }
        else if(Rdx ==2){
            return Integer.toBinaryString(Num);
        }
        else{
            String N = "";
            char Chars[]={'0','1','2','3','4','5','6','7'};
            while(Num > 0){
                N =Chars[Num %8] + N;
                Num = Num/8;
            }
            return N;
        }
    }
    public static int coreConverterToDecimal(String Number, int Rdx) {
        Pattern pattern = Pattern.compile(regex);
        Matcher Match = pattern.matcher(Number);

        int Total;
        Number = Number.toUpperCase();
        Total = 0;
        if (Match.matches()==false) {
            if (Rdx== 16) {
                char hexadec[] ={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                for (int i = 0; i < Number.length(); i++) {
                    for (int j = 0; j < hexadec.length; j++) {
                            if (Number.toUpperCase().charAt(i) == hexadec[j]) {
                                Total=(int)(Total+j*Math.pow(16,Number.length()-1-i));
                        }
                    }
                }
            }
        } else{
            double Jml;
            if (Rdx== 2) {
                Jml =0;
                for (int i=0;i<Number.length(); i++) {
                    if (Number.charAt(i)=='1'){
                        Jml=(int)(Jml+1*Math.pow(2,Number.length()-1-i));
                    }
                }
                Total=(int)Jml;
            }
        }

        return Total;
    }

}
