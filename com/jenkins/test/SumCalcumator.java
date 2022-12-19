package com.jenkins.test;

public class SumCalcumator {

    public int getSumOfNumbers(int from, int to) {

        
        if(from > to)
            throw new ArithmeticException();

        int sum = 0;
        for(int i = from ; i <= to ; i++) {

            sum += i;
        }
        return sum;
    }
}
