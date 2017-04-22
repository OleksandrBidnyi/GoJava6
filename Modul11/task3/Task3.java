package task3;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Aleksandr on 18.04.2017.
 */
public class Task3 {

    public static void main(String[] args) throws Exception {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("Package", "File");
        mapString.put("package", "file");

        System.out.println("Original text in file: " + "\n" + reviewFile());

        System.out.println("Replacing words: " + mapString.toString() + "\n");

        fileContentMerger(mapString);

        System.out.println("File after  add string to the existing file content: " + "\n" + reviewFile());
    }

    static String reviewFile() throws Exception {
        Path path = Paths.get("src/task3/text3.txt");
        StringBuilder s = new StringBuilder();
        Stream streamFromFiles = Files.lines(path);
        streamFromFiles.forEach(line -> s.append(line + System.lineSeparator()));
        String string = s.toString();
        streamFromFiles.close();
        return string;
    }

    static File fileContentMerger(Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            Stream<String> streamFromFiles = Files.lines(Paths.get("src/task3/text3.txt"));
            streamFromFiles.forEach(line -> sb.append(line + System.lineSeparator()));
            streamFromFiles.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = sb.toString();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            string = string.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        Path write = Files.write(Paths.get("src/task3/text3.txt"), string.getBytes(), StandardOpenOption.APPEND);
        File file = new File(write.toFile(), string);
        return file;
    }
}
