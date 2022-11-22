package practice;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance; // volatile

