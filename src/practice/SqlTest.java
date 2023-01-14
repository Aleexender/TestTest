package practice;

public class SqlTest {
    public static void main(String[] args) {
        String id = "qwe";
        System.out.println("SELECT * \n" + "FROM member\n" + "WHERE `id` = '" + id + "'");
    }
}
