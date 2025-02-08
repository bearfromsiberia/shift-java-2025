package org.example;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        ArgumentsHandler aHandler = new ArgumentsHandler(args);
        FilesHandler filesHandler = new FilesHandler(aHandler.getFilesPath());
        TypesSorter sorter = new TypesSorter();
        sorter.sortFiles(filesHandler.getFiles());
        Writer.writeFile(aHandler.getPathToFiles()+aHandler.getIntegers().toString(), sorter.getIntegers(), aHandler.isAppend());
        Writer.writeFile(aHandler.getPathToFiles()+aHandler.getFloats().toString(), sorter.getDoubles(), aHandler.isAppend());
        Writer.writeFile(aHandler.getPathToFiles()+aHandler.getStrings(),
                sorter.getStrings(),
                aHandler.isAppend());
        if(aHandler.isFullStat()){
            Statistic.printFullStatistic(sorter.getIntegers(),sorter.getDoubles(),sorter.getStrings());
            System.exit(0);
        }
        if (aHandler.isShortStat()) {
            Statistic.printShortStatistic(sorter.getIntegers(),sorter.getDoubles(),sorter.getStrings());
        }
    }
}