import java.util.Scanner;

public class StudentDatabase 
{
    public static void main(String[] args) 
    {
        Student student = new Student();
        student.enrollment();
        student.PayTuition(); 
        System.out.println(student.toString());   

        System.out.println("Enter num of students to be enrolled: ");
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            Student[] students = new Student[num];

            for (int i = 0; i < students.length; i++) {
                students[i] = new Student();
                students[i].enrollment();
                students[i].PayTuition();
                System.out.println(students[i].toString());
            }
        }
    }
}