package module28;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_3 {
    public static List<Class> getAllClasses() throws Exception {
        URL upackage = Task2_3.class.getClassLoader().getResource("");

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            classes.add(Class.forName(line.replace(".class", "")));
        }

        return classes;
    }

    public static void main(String[] args) throws Exception {
        List<Class> classes = getAllClasses();
        for (Class clazz : classes){
            Field[] allClassFiled = clazz.getDeclaredFields();
            Method[] alClassesMethoda = clazz.getMethods();
            Arrays.asList(allClassFiled).forEach(field -> {if (!Modifier.isPrivate(field.getModifiers())){
                System.out.println("Field with name \"" + field.getName() + "should be private");
            }});
        }
    }

}
