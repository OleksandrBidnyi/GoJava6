package task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Aleksandr on 18.04.2017.
 */
public class Task2 {
    public static void main(String[] args) throws Exception {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("Package", "File");
        mapString.put("package", "file");

        System.out.println("Original text in file: " + "\n" + reviewFile());

        System.out.println("Replacing words: " + mapString.toString() + "\n");

        fileContentReplacer(mapString);

        System.out.println("File after rewrite: " + "\n" + reviewFile());
    }

    static String reviewFile() throws Exception {
        Path path = Paths.get("src/task2/text2.txt");
        StringBuilder s = new StringBuilder();
        Stream streamFromFiles = Files.lines(path);
        streamFromFiles.forEach(line -> s.append(line + System.lineSeparator()));
        String string = s.toString();
        streamFromFiles.close();
        return string;
    }

    static File fileContentReplacer(Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            Stream<String> streamFromFiles = Files.lines(Paths.get("src/task2/text2.txt"));
            streamFromFiles.forEach(line -> sb.append(line + "\n"));
            streamFromFiles.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = sb.toString();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            string = string.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        Path write = Files.write(Paths.get("src/task2/text2.txt"), string.getBytes());
        File file = new File(write.toFile(), string);
        return file;
    }
}

