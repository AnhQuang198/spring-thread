package com.example.springthread.learn;

import java.util.ArrayList;
import java.util.List;

public class StrCollection {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Quang", true, 18, 8));
        students.add(new Student("Nam", true, 18, 8));
        students.add(new Student("Tuan", true, 18, 8));
        students.add(new Student("Phuong", false, 18, 8));
        students.add(new Student("Thuong", false, 18, 8));
        students.add(new Student("Huyen", false, 18, 8));
        students.add(new Student("Trang", false, 18, 8));
        students.add(new Student("Thanh", true, 18, 8));
        students.add(new Student("Duc", true, 18, 8));
        students.add(new Student("Quang", true, 18, 8));




    }
}
