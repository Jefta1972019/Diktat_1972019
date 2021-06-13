//1972019-JeftaBenedictAmpouw
public class Student extends Person{
    private int studentNumber;

    public Student() {
    }

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println(studentNumber);
    }
}
