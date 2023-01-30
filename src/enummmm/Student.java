package enummmm;

public enum Student {
    STUDENT1("정훈","25","고졸"),
    STUDENT2("선우","16","중딩"),
    STUDENT3("아영", "17", "고딩");

    String name;
    String age;
    String school;

    Student(String name, String age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

}
