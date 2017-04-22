package task4v2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Aleksandr on 22.04.2017.
 */
public class Task4v2 {
    public static void main(String[] args) {
        String word = "some";
        System.out.println("World:'" + word + "'; count in file " + checkWord(word));
    }

    static int checkWord(String word) {
        StringBuilder sbText = new StringBuilder();
        try (Stream streamFromFile = Files.lines(Paths.get("src/task4v1/text4.1.txt"))) {
            streamFromFile.forEach(line -> sbText.append(line + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sbText.toString();
        return countOfEntryWord(text, word);
    }

    private static int countOfEntryWord(String text, String word) {
        int i;
        String textArray[] = text.split(word);
        i = textArray.length - 1;
        if (text.endsWith(word)) {
            i++;
        }
        return i;
    }
}





