package practice;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton3 = null;

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(); // 리플렉션 (싱글톤을 깨트리는 방법)
