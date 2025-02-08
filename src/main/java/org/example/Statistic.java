package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
// Класс для вывода статистики
public class Statistic {
    // Вывод краткой статистики
    public static void printShortStatistic(ArrayList<Long> integers,
                                      ArrayList<Double> doubles,
                                      ArrayList<String> strings){
            if (!integers.isEmpty()){
                System.out.println("Integers count: " + integers.size());
            }
            if (!doubles.isEmpty()){
                System.out.println("Floats count: " + doubles.size());
            }
            if (!strings.isEmpty()){
                System.out.println("Strings count: " + strings.size());
            }
    }
    // Вывод полной статистики
    public static void printFullStatistic(ArrayList<Long> integers,
                                          ArrayList<Double> doubles,
                                          ArrayList<String> strings){
            printShortStatistic(integers, doubles, strings);
            System.out.println();
            if (!integers.isEmpty()){
                System.out.println("Min integer: " + integers.stream().min(Long::compareTo).orElse(0L) +
                        "\nMax integer: " + integers.stream().max(Long::compareTo).get() +
                        "\nSum integer: " + integers.stream().mapToLong(Long::longValue).sum() +
                        "\nAvg integer: " + integers.stream().mapToLong(Long::longValue).average().orElse(0L) +
                        "\n");
            }
            if (!doubles.isEmpty()){
                System.out.println("Min float: " +
                        doubles.stream().min(Double::compareTo).get() +
                        "\nMax float: " + doubles.stream().max(Double::compareTo).get() +
                        "\nSum float: " + doubles.stream().mapToDouble(Double::doubleValue).sum() +
                        "\nAvg float: " + doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0) +
                        "\n");
            }
            if (!strings.isEmpty()){
                System.out.println("Length of the longest string: " + strings.stream().max(Comparator.comparingInt(String::length)).orElse("") +
                        "\nLength of the shortest string: " + strings.stream().min(Comparator.comparingInt(String::length)).orElse(""));
            }

    }
}
