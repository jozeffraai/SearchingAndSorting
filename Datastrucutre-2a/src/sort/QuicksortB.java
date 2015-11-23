/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import model.Student;

public class QuicksortB {
   

    public static void sort(Student[] arr, int lo, int hi) {
        
            if(hi <= lo) return;
            int lt = lo, i = lo+1, gt = hi;
            Student x = arr[lo];
            
            while (i <= gt){
                if(arr[i].compareTo(x) < 0) exch(arr, lt++, i++);
                else if(x.compareTo(arr[i]) < 0) exch(arr, i, gt--);
                else i++;
            }
            sort(arr, lo, lt - 1);
            sort(arr, gt + 1, hi);
    }
    
    private static void exch(Student[] arr, int i, int j){ 
        Student tmp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = tmp; 
    }
}
