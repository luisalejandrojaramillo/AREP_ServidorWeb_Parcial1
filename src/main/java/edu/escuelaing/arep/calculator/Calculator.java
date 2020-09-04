package edu.escuelaing.arep.calculator;

public class Calculator {

    public Calculator(){

    }

    public static double[] bubbleSort(double[] arr) {
        int longitud = arr.length;
        double temp = 0;
        for(int i=0; i < longitud; i++){
            for(int j=1; j < (longitud-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(double arr[]) {
        double n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}

