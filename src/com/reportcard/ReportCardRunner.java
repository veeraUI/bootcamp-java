package com.reportcard;

import java.util.Arrays;

public class ReportCardRunner {
    public static void main(String[] args) {
        ReportCard student = new ReportCard("Veera", 20,30,40,50,90);
        System.out.println(student.getTotalSumOfMarks());
        System.out.println(student.getMarks());
        System.out.println(student.getName());
        System.out.println(student.getAverageMark());
        System.out.println(student.getMinMark());
        System.out.println(student.getMaxMark());
    }
}
