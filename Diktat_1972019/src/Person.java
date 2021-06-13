//1972019-JeftaBenedictAmpouw
public abstract class Person {
    protected String name;

    protected Person() {
    }

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public abstract void writeOutput();
}

