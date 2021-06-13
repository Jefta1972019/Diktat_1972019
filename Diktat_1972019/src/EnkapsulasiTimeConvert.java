//1972019-JeftaBenedictAmpouw
public class EnkapsulasiTimeConvert {
    private int Second;

    public EnkapsulasiTimeConvert(){
    }

    public EnkapsulasiTimeConvert(int second) {
        this.Second = second;
    }

    public int getSecond() {
        return Second;
    }

    public void setSecond(int second) {
        this.Second = second;
    }

    public String ShowTime(){
        String Hour = String.valueOf(Math.abs(Second/3600));
        int SisaHour = Second%3600;
        String Minute = String.valueOf(Math.abs(SisaHour/60));
        int SisaMinute = Second%60;
        String Sec = String.valueOf(Math.abs(SisaMinute));
        String Total = Hour +" : "+ Minute +" : "+ Sec;
        return Total;
    }
}
