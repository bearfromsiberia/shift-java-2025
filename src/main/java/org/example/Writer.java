package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public static <T> void writeFile(String fileName, ArrayList<T> content, boolean append) {
        if (!content.isEmpty()){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
                for (T t : content) {
                    writer.write(t.toString());
                    writer.newLine();
                }
                writer.flush();
            } catch (IOException e) {
                System.err.println("Error writing to file " + fileName);
            }
        }
    }
}
