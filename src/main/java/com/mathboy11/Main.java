package com.mathboy11;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("<YOUR_PROJECT_FOLDER>/src/main/resources/demo.csv");
        CSVReader csvReader = new CSVReader(fileReader);

        ArrayList<CSVModel> beans = new ArrayList<>(new CsvToBeanBuilder<CSVModel>(csvReader).withType(CSVModel.class).withIgnoreLeadingWhiteSpace(true).build().stream().toList());

        for (CSVModel model : beans) {
            System.out.println("---");
            System.out.println(model.getName());
            System.out.println(model.getAge());
            System.out.println(model.getInterest());
        }
    }
}