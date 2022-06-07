package module15.task1564;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("files/numbers.txt");
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException exception) {
                System.out.println("Ошибка создания файла!");
                exception.printStackTrace();
            }
        }
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset())) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    writer.write(String.valueOf(j));
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            e.printStackTrace();
        }
        List<String> stringList=null;
        try {
            stringList = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path2 = Paths.get("files/revers numbers.txt");
        if (!Files.exists(path)) {
            try {
                Files.createFile(path2);
            } catch (IOException exception) {
                System.out.println("Ошибка создания файла!");
                exception.printStackTrace();
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path2, Charset.defaultCharset())) {
            for (int i = 0; i < stringList.size(); i++) {
                writer.write(stringList.get(stringList.size() - 1 - i) + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
