package com.reportcard;

import java.util.Arrays;

public class ReportCardRunner {
    public static void main(String[] args) {
        int[] marks = new int[]{20,30,40,50,90};
        ReportCard student = new ReportCard("Veera", marks);
        System.out.println(student.getTotalSumOfMarks());
        System.out.println(student.getMarks());
        System.out.println(student.getName());
        System.out.println(student.getAverageMark());
        System.out.println(student.getMinMark());
        System.out.println(student.getMaxMark());
    }
}
