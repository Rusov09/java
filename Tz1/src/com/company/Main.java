package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] i = new int[100];
        generation(i);
        i = bubbleSort();
        for (int j = 0; j<i.length; j++){System.out.println(i[j]);
        }
    }

    public static int[] generation(int[] i) {
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            i[j] = random.nextInt();
        }
        return i;
    }

    public static int[] bubbleSort(){

        int[] arr = new int[100];
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j] > arr[j+1] ){
            int tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
}
}
}
        return arr;
    }


}
