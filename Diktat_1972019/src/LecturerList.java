import java.util.ArrayList;
//1972019-JeftaBenedictAmpouw
public class LecturerList {
    private ArrayList<Student> Arrlecturer;

    public StudentList() {
        Arrlecturer = new ArrayList<>();
    }

    public void showAlllecturer(){
        for(Lecturer lecturer : Arrlecturer){
            System.out.println("nidn :"+ lecturer.getNidn());
        }
    }

    public boolean addNewLecturer(Lecturer lecturer){
        return Arrlecturer.add(lecturer);
    }
}
