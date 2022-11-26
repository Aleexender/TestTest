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
        constructor.setAccessible(true);
        Singleton singleton2 = constructor.newInstance();

        System.out.println(singleton == singleton1);
        System.out.println(singleton == singleton2);

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) { // 직렬화 역직렬화
            out.writeObject(singleton);
        }
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
           singleton3 = (Singleton) in.readObject();
        }

        System.out.println(singleton == singleton3);

    }
}
