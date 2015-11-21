/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import comparables.StudentCompare;
import model.Student;

public class Quicksort {
    
  private StudentCompare compare;
  private Student[] students;
  private int number;
  
  public Quicksort(){}
  
  public void sort(Student[] students) {
     
    if (students ==null ){
      return;
    }
    this.students = students;
    number = students.length;
    quicksort(0, number - 1);
  }

  private void quicksort(int low, int high) {
    int i = low, j = high;

    Student pivot = students[low + (high-low)/2];


    while (i <= j) {

      while (students[i].getGrade() < pivot.getGrade()) {
        i++;
      }

      while (students[j].getGrade() > pivot.getGrade()) {
        j--;
      }

      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }

    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private void exchange(int i, int j) {
    Student temp = students[i];
    students[i] = students[j];
    students[j] = temp;
  }
    
}
