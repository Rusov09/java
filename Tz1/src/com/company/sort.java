package com.company;

import java.util.Random;

/**
 * Created by Максим on 18.01.2017.
 */
public class sort {
    public void main1()
    {
        int[] array = new int[100];
        array = generateArray();
        array = makeSort();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public int[] generateArray() {
        int[] x = new int[100];
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            x[i] = random.nextInt();
        }
        return x;
    }
    public int[] makeSort()
    {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
/* , (
) */
            int min = x[i];
            int min_i = i;
/* ,
*/
            for (int j = i+1; j < x.length; j++) {
// ,
                if (x[j] < min) {
                    min = x[j];
                    min_i = j;
                }
            }
/* , , ,
*/
            if (i != min_i) {
                int tmp = x[i];
                x[i] = x[min_i];
                x[min_i] = tmp;
            }
        }
        return x;
    }
}


