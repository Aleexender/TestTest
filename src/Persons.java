public class Persons {

        private int personAge;
        private String personName;
        private boolean personIsMarried;
        private int personChildren;

    public int getPersonAge() {
        return personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public boolean isPersonIsMarried() {
        return personIsMarried;
    }

    public int getPersonChildren() {
        return personChildren;
    }
    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonIsMarried(boolean personIsMarried) {
        this.personIsMarried = personIsMarried;
    }

    public void setPersonChildren(int personChildren) {
        this.personChildren = personChildren;
    }

    public static void main(String[] args) {
        Persons persons = new Persons();

        persons.setPersonAge(21);
        persons.setPersonName("정훈");

        System.out.println(persons.getPersonName());
        System.out.println(persons.getPersonAge());
    }
}
