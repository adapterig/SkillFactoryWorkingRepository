package module10.task3;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        copyFileUsingStream("video.mkv", "IMG01.avi");
    }

    private static void copyFileUsingStream(String source, String dest) throws IOException {

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[12];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}