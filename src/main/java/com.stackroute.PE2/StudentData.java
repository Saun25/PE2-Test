package com.stackroute.PE2;

import java.util.Arrays;

public class StudentData {

    public double[] studentData(int noOfStudents,int studentArray[]){
        double array[]={0.0,0.0,0.0};
        double sum=0.0;
        array[1]=100.0;
        for(int i=0;i<noOfStudents;i++) {
                sum += studentArray[i];
                if (array[2] < studentArray[i]) {
                    array[2] = studentArray[i];
                } else if (array[1] > studentArray[i]) {
                    array[1] = studentArray[i];
                }
            }

        array[0]=sum/noOfStudents;
        return array;
    }
}
