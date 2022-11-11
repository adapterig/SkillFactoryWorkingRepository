package module28;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Task2_2 {
    public static List<Class> getAllClasses() throws Exception {
        URL upackage = Task2_2.class.getClassLoader().getResource("");
        System.out.println(upackage);

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            classes.add(Class.forName(line.replace(".class", "")));
        }

        return classes;
    }
    public static void main(String[] args) throws Exception{
        List<Class> classes = getAllClasses();
        for(Class clazz: classes){
            if (Deletable.class.isAssignableFrom(clazz)
                    && !Modifier.isInterface(clazz.getModifiers())) {
                Deletable deletable = (Deletable) clazz.getConstructor().newInstance();
                deletable.delete("s3d4");
            }
        }
    }

}
