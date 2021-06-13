import java.util.ArrayList;

//1972019-JeftaBenedictAmpouw
public class FacultyMember {
    private ArrayList<Person> ArrPerson;

    public FacultyMember() {
        ArrPerson = new ArrayList<>();
    }

    public void showAll(){
        Lecturer lecturer;
        Student student;
        for (Person person : ArrPerson){
            System.out.println("Name : "+ person.getName());
            System.out.println("nidn : "+ lecturer.writeOutput(););
            System.out.println("Name : "+ student.writeOutput(););
        }
    }

    public boolean addPerson(Person person){
        return ArrPerson.add(person);
    }

    public void showAllLecturer(){
        for(Person person : ArrPerson){
            Lecturer lecturer;
            System.out.println("name :" + person.getName());
            System.out.println("nidn :" + lecturer.writeOutput(););
        }
    }
}
