package module28;

import java.lang.reflect.*;

import java.util.HashMap;

public class Task2_1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*Class arrayList = Class.forName("java.util.ArrayList");
        Class abstractList = Class.forName("java.util.AbstractList");
        Class collection = Class.forName("java.util.Collection");
        int arrayListModifiers = arrayList.getModifiers();
        int abstractListModifiers = abstractList.getModifiers();
        int collectionModifiers = collection.getModifiers();
        System.out.println("Array list is public: " + Modifier.isPublic(arrayListModifiers));
        System.out.println("Array list is protected: " + Modifier.isProtected(arrayListModifiers));
        System.out.println("AbstractList is static: " + Modifier.isStatic(abstractListModifiers));
        System.out.println("AbstractList is abstract: " + Modifier.isAbstract(abstractListModifiers));
        System.out.println("Collection is interface: " + Modifier.isInterface(collectionModifiers));

        System.out.println();
        Object map = new HashMap<>();
        Class[] interfaces = map.getClass().getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
        System.out.println();
        Constructor[] constructors = map.getClass().getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println();
        Field[] fields = map.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println();
        Method[] methods = map.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);*/

        Class<?> mapClass= Class.forName("java.util.HashMap");
        Constructor<?> constructor = mapClass.getConstructor();

        HashMap map = (HashMap) constructor.newInstance();

        System.out.println(map.getClass().getSimpleName());
        System.out.println(map.isEmpty());
    }
}
