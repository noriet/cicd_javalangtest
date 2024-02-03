package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
    
    // メインメソッドはデモとして用意しています。実際のアプリケーションでは不要です。
    public static void main(String[] args) {
        try {
            String content = readFile("あなたのファイルパス");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
