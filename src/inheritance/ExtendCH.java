package inheritance;

public class ExtendCH extends ExtendPa {
    ExtendPa parent = new ExtendPa();


    public void studentProfile() {
        parent.setName("정훈");
        parent.setAge(25);
        System.out.println(parent.getAge());
        System.out.println(parent.getName());
    }

    public void parentSkill() {
        parent.say();
    }

}
