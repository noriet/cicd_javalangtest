package app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

public class FileReaderTest {

    @Test
    public void testReadFile() throws IOException {
        // テスト用の一時ファイルを作成
        Path tempFile = Files.createTempFile("test-", ".txt");
        Files.write(tempFile, "こんにちは、世界！".getBytes());

        // FileReaderクラスのreadFileメソッドを使用してファイルの内容を読み取る
        String content = FileReader.readFile(tempFile.toString());

        // 読み取った内容が期待したものと一致するか検証
        assertEquals("こんにちは、世界！", content);

        // 一時ファイルを削除
        Files.delete(tempFile);
    }
}
