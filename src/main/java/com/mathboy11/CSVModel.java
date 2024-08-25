package com.mathboy11;

import com.opencsv.bean.CsvBindByName;

public class CSVModel {
    @CsvBindByName(column = "Name", required = true)
    private String name;

    @CsvBindByName(column = "Age")
    private Integer age;

    @CsvBindByName(column = "Interest", required = true)
    private Interest interest;

    public CSVModel() {
    }

    public CSVModel(String name, Integer age, Interest interest) {
        this.name = name;
        this.age = age;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }
}
