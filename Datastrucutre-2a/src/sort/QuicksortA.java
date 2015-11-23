/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import model.Student;

/**
 *
 * @author Mohamed
 */
public class QuicksortA {
    
     public static void sort(Student[] arr, int lo, int hi) {

        if (lo < hi) {
            int i = lo, j = hi;
            Student x = arr[(i + j) / 2];

            do {
                while (arr[i].compareTo(x) < 0) {
                    i++;
                }
                while (x.compareTo(arr[j]) < 0) {
                    j--;
                }

                if (i <= j){ 
                  exch(arr, i, j);
                  i++;
                  j--;
                }

            } while (i <= j);

            sort(arr, lo, j);
            sort(arr, i, hi);
        }
    }
     
    private static void exch(Student[] arr, int i, int j){ 
        Student tmp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = tmp; 
    }
}
