//1972019-JeftaBenedictAmpouw
public class Lecturer extends Person{
    private String nidn;

    public Lecturer() {
    }

    public Lecturer(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public void writeOutput() {
        System.out.println(nidn);
    }
}
