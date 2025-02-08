package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
// Класс для сортировки данных
public class TypesSorter {
    private  ArrayList<Long> integers = new ArrayList<>();
    private ArrayList<Double> doubles = new ArrayList<>();
    private ArrayList<String> strings = new ArrayList<>();

    public void sortFiles(ArrayList<BufferedReader> readers) {
        // эта часть считывает поочередно строки из файлов
        boolean read = true;
        while(read) {
            read = false;
            for (BufferedReader reader : readers) {
                try{
                    String line = reader.readLine();
                    if (line != null) {
                        sort(line);
                        read = true;
                    }
                }
                catch (IOException _){
                }
            }
        }
        // закрываем ресурсы
        for (BufferedReader reader : readers) {
            try {
                reader.close();
            }
            catch (IOException e){
                System.out.println("Произошла ошибка при закрытии файла");
            }
        }
    }

    private void sort(String input) {
        // сортирует данные в зависимости от типа
        try{
            long l = Long.parseLong(input.trim());
            integers.add(l);
        }
        catch (NumberFormatException e){
            try{
                Double.parseDouble(input.trim());
                double d = Double.parseDouble(input.trim());
                doubles.add(d);
            }
            catch (NumberFormatException e2){
                strings.add(input.trim());
            }
        }
    }

    public ArrayList<Double> getDoubles() {
        return doubles;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public ArrayList<Long> getIntegers() {
        return integers;
    }



}
