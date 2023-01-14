package singleTon;

public class SingletonTest {
    private static SingletonTest singletonTest;

    private SingletonTest() {

    }

    public static SingletonTest getSingletonTest() {
        if (singletonTest == null) {
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }
}
