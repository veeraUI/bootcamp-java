package com.company.multiplicationtable;

public class MultiplicationTable {
    void multiply(int multiplicationTable) {
        for(int i=0; i< 10; i++) {
            System.out.printf("%d * %d = %d", multiplicationTable, i, multiplicationTable * i);
        }
    }
}
