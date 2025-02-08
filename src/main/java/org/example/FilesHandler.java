package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FilesHandler {
    private ArrayList<BufferedReader> files = new ArrayList<>();

    public FilesHandler(ArrayList<String> filesPaths){
        if (filesPaths.isEmpty()) {
            System.out.println("No files found");
            System.exit(0);
        }
        for (String path : filesPaths) {
            try {
                var file = new BufferedReader(new FileReader(path));
                files.add(file);
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.exit(0);
            }
        }
    }

    public ArrayList<BufferedReader> getFiles() {
        return files;
    }
}
