package enummmm;

public class Enum {
    public static void main(String[] args) {
        Rainbow rainbow = Rainbow.BLUE;
        System.out.println(rainbow);
        Student[] students = Student.values();
        Student student = Student.STUDENT1;
        System.out.println(student);

    }
}
