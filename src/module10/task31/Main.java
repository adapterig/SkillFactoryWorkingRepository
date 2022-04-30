package module10.task31;

import java.util.Scanner;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Root/files/request.txt");
        String string = "GIVE ME THE CODE, PLEASE";
        fos.write(string.getBytes());

    }

}
