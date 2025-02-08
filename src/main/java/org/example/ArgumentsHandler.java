package org.example;

import java.util.ArrayList;
// парсер аргументов
public class ArgumentsHandler {
    private boolean shortStat = false;
    private boolean fullStat = false;
    private StringBuilder integers = new StringBuilder("integer.txt");
    private StringBuilder floats = new StringBuilder("floats.txt");
    private StringBuilder strings = new StringBuilder("strings.txt");
    private boolean append = false;
    private String pathToFiles = "";
    private ArrayList<String> filesPath = new ArrayList<>();

    public boolean isFullStat() {
        return fullStat;
    }

    public boolean isShortStat() {
        return shortStat;
    }

    public StringBuilder getIntegers() {
        return integers;
    }

    public StringBuilder getFloats() {
        return floats;
    }

    public StringBuilder getStrings() {
        return strings;
    }

    public boolean isAppend() {
        return append;
    }

    public String getPathToFiles() {
        return pathToFiles;
    }

    public ArrayList<String> getFilesPath() {
        return filesPath;
    }

    public ArgumentsHandler(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case ("-s"):
                    shortStat = true;
                    break;
                case ("-f"):
                    fullStat = true;
                    break;
                case ("-p"):
                    try {
                        i++;
                        if (args[i].equals("-f")
                                || args[i].equals("-s")
                                || args[i].equals("-o")
                                || args[i].equals("-a")){
                            System.out.println("You haven't typed prefix after -p");
                            System.exit(0);
                        }
                        integers.insert(0, args[i]);
                        floats.insert(0, args[i]);
                        strings.insert(0, args[i]);
                        break;
                    }
                    catch (Exception e) {
                        System.out.println("Problems with argument -p");
                        System.exit(0);
                    }
                case ("-a"):
                    append = true;
                    break;
                case ("-o"):
                    try {
                        i++;
                        if (args[i].equals("-f")
                                || args[i].equals("-s")
                                || args[i].equals("-p")
                                || args[i].equals("-a")){
                            System.out.println("You haven't typed path after -o");
                            System.exit(0);
                        }
                        pathToFiles = args[i] + "/";
                        break;
                    }
                    catch (Exception e) {
                        System.out.println("Problems with argument -o");
                        System.exit(0);
                    }
                default:
                    filesPath.add(args[i]);
            }
        }
    }
}
