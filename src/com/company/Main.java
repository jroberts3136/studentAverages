package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner textInput = new Scanner(new File("StudentScores"));

        int index = -1;
        double gradeSum;
        double gradeCount;
        double average;
        String name = "";
        String [] lineData = new String[100];
        String [] averagePrint;

        while(textInput.hasNext()){
            index++;
            lineData [index] = textInput.nextLine();
        }
        textInput.close();

        averagePrint = new String[index + 1];

        for (int i = 0; i <= index; i++) {
            Scanner lineSearch = new Scanner(lineData[i]);
            gradeSum = 0;
            gradeCount = 0;
            average = 0;
            name = lineSearch.next();

            while (lineSearch.hasNext()){
                gradeSum += lineSearch.nextInt();
                gradeCount++;
            }
            average = gradeSum/gradeCount;
            average = Math.round(average);
            averagePrint[i] = name + ", average = "+ (int)average;
        }

        //System.out.println(averagePrint.toString());
        for (String a:averagePrint) {
            System.out.println(a);
        }
    }
}
