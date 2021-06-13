import java.util.ArrayList;

//1972019-JeftaBenedictAmpouw
public class PersonList {
    private ArrayList<Person> Arrperson;

    public StudentList() {
        Arrperson = new ArrayList<>();
    }

    public void showAllStudent(){
        Arrperson.forEach(Person::writeOutput);
    }

    public boolean addNewStudent(Person person){
        return Arrperson.add(person);
    }
}
