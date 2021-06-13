import java.util.Scanner;

//1972019-JeftaBenedictAmpouw
public class PersonDemo {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("1. Show all data");
        System.out.println("2. Add new lecturer");
        System.out.println("3. Add new student");
        System.out.println("4. Exit");
        System.out.print("Choice : ");
        int Choice,StudentId;
        String nidn,Name;
        Person person;
        FacultyMember facultyMember;
        Lecturer lecturer;
        Student student;
        Scanner sc = Scanner(System.in);
        Choice = sc.nextInt();
        do{
            if(Choice == 1){
                facultyMember.showAll();
            }else if(Choice == 2){
                System.out.print("Name :");
                Name = sc.next();
                person.setName(Name);
                System.out.print("nidn :");
                nidn = sc.next();
                lecturer.setNidn(nidn);
            }else{
                System.out.print("Name :");
                Name = sc.next();
                person.setName(Name);
                System.out.print("StudentNumber :");
                StudentId = sc.nextInt();
                student.setStudentNumber(StudentId);
            }
            System.out.println("==============================");
            System.out.println("1. Show all data");
            System.out.println("2. Add new lecturer");
            System.out.println("3. Add new student");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            int Choice;
            Scanner sc = Scanner(System.in);
            Choice = sc.nextInt();
        }while(Choice != 4);
    }
}
