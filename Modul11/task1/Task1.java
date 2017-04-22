package task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Aleksandr on 17.04.2017.
 */
public class Task1 {
    public static void main(String[] args) throws Exception {
        Map<String, String> mapStrings = new HashMap<>();
        mapStrings.put("some", "newsome");

        System.out.println("Original text in file: " + "\n" + reviewFile().toString());

        System.out.println("Replacing words: " + mapStrings.toString() + "\n");

        System.out.println("Return new string " + "\n" + replacer(mapStrings));
    }

    static String reviewFile() throws Exception {
        Path path = Paths.get("src/task1/text.txt");
        StringBuilder s = new StringBuilder();
        Stream streamFromFiles = Files.lines(path);
        streamFromFiles.forEach(line -> s.append(line + System.lineSeparator()));
        String string = s.toString();
        streamFromFiles.close();
        return string;
    }

    static String replacer(Map<String, String> map) {
        StringBuilder s = new StringBuilder();
        try {
            Stream<String> streamFromFiles = Files.lines(Paths.get("src/task1/text.txt"));
            streamFromFiles.forEach(line -> s.append(line + System.lineSeparator()));
            streamFromFiles.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = s.toString();

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            string = string.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        return string;
    }
}
