package com.ukim.finki.domashna2.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFilter {

    public static void duplicateFilter(String inputCsvFileName, String outputCsvFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputCsvFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputCsvFileName))) {

            String line;
            Set<String> uniqueEntries = new HashSet<>();
            writer.append("Name, Address, Rating, Number of Ratings, Location\n");
            while ((line = reader.readLine()) != null) {
                if (uniqueEntries.add(line)) {
                    if (line.contains("North Macedonia")) {
                        writer.write(line);
                        writer.newLine();
                    }
//                    else{
//                        System.out.println(line);
//                    }

                }
            }

            System.out.println("Unikatni entries kopirani vo " + outputCsvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
