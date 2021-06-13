import java.util.ArrayList;

//1972019-JeftaBenedictAmpouw
public class StudentList {
    private ArrayList<Student> Arrstudent;

    public StudentList() {
        Arrstudent = new ArrayList<>();
    }

    public void showAllStudent(){
        for(Student student : Arrstudent){
            System.out.println("Student number :"+ student.getStudentNumber());
        }
    }

    public boolean addNewStudent(Student student){
        return Arrstudent.add(student);
    }
}
