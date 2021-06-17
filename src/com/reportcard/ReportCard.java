package com.reportcard;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class ReportCard {
    private String name;
    private int[] marks;
    // int[] ---> int...
    ReportCard(String name, int... marks){
        setName(name);
        setMarks(marks);
    }

    public String getMarks() {
        return marks.toString();
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int m: marks) {
            sum = sum + m;
        }
        return sum;
    }

    public int getMaxMark(){
        int maxMark = Integer.MIN_VALUE; //000
        for(int min: marks) { //200, 500, 600, 100
            if(min > maxMark) {
                maxMark = min;
            }
        }

        return maxMark;
    }

    public int getMinMark() {
        int minMark = Integer.MAX_VALUE; //666600
        for(int min: marks) { //200, 500, 600, 100
            if(min < minMark) {
                minMark = min;
            }
        }

        return minMark;
    }

    public BigDecimal getAverageMark() {
        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(marks.length));
    }
}
