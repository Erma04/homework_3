package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {3.5, 2.5, -6.1, -9.6, -2.5, 6.12, -7.28, 8.54, 3.3, -1.9, 5.32, -4.11, 3.89, 2.6, 5.3};
        double sum = 0;
        double average = 0;
        int count = 0;
        boolean firstNegativeNumber = false;

        for (double numb : numbers) {
            if (numb < 0) {
                firstNegativeNumber = true;
                continue;
            }
            if (firstNegativeNumber) {
                sum += numb;
                count++;
            }

        }
        average = sum / count;
        System.out.println(average);

        //Дз на сообразительность
        for (int i = 0; i < numbers.length; i++) {
            int minInd = i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[minInd]>numbers[j]){
                    minInd = j;
                }
            }
            double tmp = numbers[minInd];
            numbers[minInd] = numbers[i];
            numbers[i] = tmp;
        }
        System.out.println(Arrays.toString(numbers));

    }

}