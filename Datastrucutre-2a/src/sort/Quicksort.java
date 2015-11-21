/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import model.Student;

public class Quicksort {

    public static void qsort(Student[] arr, int a, int b) {

        if (a < b) {
            int i = a, j = b;
            Student x = arr[(i + j) / 2];

            do {
                while (arr[i].compareTo(x) < 0) {
                    i++;
                }
                while (x.compareTo(arr[j]) < 0) {
                    j--;
                }

                if (i <= j) {
                    Student tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            qsort(arr, a, j);
            qsort(arr, i, b);
        }
    }
}
