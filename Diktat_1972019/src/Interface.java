//1972019-JeftaBenedictAmpouw
public class Interface {
    public static void main(String[] args) {
        Object[] objects = {new Chicken(),new Orange()};
        for(Object object : objects){
            if(objects instanceof Edible) {
                System.out.println(((Edible) object.howToEat()));
            }
            if(objects instanceof Animal){
                System.out.println(((Animal)object).sound());
            }
        }
    }
}
