package OOP;

public class House {
    public static void main(String[] args) {
        Elice elice = new Elice();
        Juice juice = new Juice();


        System.out.println("엘리스가 음료를 마신후 음료의 용량은= "+elice.drink() +"ml");
        System.out.println("주스를 마심으로써 엘리스의 키는= "+ juice.ability() + "cm");
    }
}
