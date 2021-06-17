package com.reportcard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class ReportCard {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    // int[] ---> int...
    ReportCard(String name, int... marks){
        setName(name);
        setMarks(marks);
    }

    public String getMarks() {
        return marks.toString();
    }

    public void setMarks(int[] marks) {
        for(int i : marks) {
            this.marks.add(i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int m: marks) {
            sum = sum + m;
        }
        return sum;
    }

    public int getMaxMark(){
        return Collections.max(this.marks);
    }

    public int getMinMark() {
       return Collections.min(this.marks);
    }

    public BigDecimal getAverageMark() {
        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(marks.size()));
    }

    public String toString() {
        return name + marks;
    }
}
