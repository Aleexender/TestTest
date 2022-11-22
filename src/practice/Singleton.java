package practice;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance; // volatile

    public static Singleton getInstance() { // 이 위치에 synchronized 에 있는거 보다
        if (instance == null) {
            synchronized (Singleton.class) { // 이 위치가 synchronized 더 효율적
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
