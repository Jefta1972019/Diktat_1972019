//1972019-JeftaBenedictAmpouw
public class PengenalanOOPA {
    public int BanyakHuruf;
    public String HasilReverse;

    public String WordReverser(String Word){
        HasilReverse="";
        BanyakHuruf = Word.length()-1;
        for(int i=0;i<Word.length();i++){
            HasilReverse += Word.charAt(BanyakHuruf);
            BanyakHuruf -= 1;
        }
        return HasilReverse;
    }
}
