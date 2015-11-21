/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Student;
import java.text.DecimalFormat;
import sort.Quicksort;


/**
 *
 * @author Joost & Mohamed
 */
public class Main {
    
    private static long totalTimeBucket;
    private static long totalTimeGen;
    private static long totalTimeInsertion;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Student[] students = generateStudents(20);
        Quicksort q = new Quicksort();
        
        q.sort(students);
        
        for(Student s : students)
            System.out.println(s.toString());
    }

    public static Student[] generateStudents(int n) {
        long startTimeGen = System.nanoTime();

        Student[] students = new Student[n];

        DecimalFormat df = new DecimalFormat("#.#");
        
        int studentNr = 500000000;
        
        for (int i = 0; i < n; i++) {
            double random = Math.random() * (1.0 - 10.0) + 10;
            String gradeFormat = df.format(random);
            double grade = Double.valueOf(gradeFormat);
            studentNr++;
            students[i] = new Student(studentNr, grade);

        }
        
        long endTimeGen = System.nanoTime();
        totalTimeGen = endTimeGen - startTimeGen;
        return students;
    }

    public static Student[] insertionSortStudentNr(Student array[]) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            Student B = array[i];
            while ((j > 0) && B != null && (array[j - 1].getStudentNr() > B.getStudentNr())) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        return array;
    }

    public static Student[] insertionSortGrade(Student array[]) {
        long startTimeInsertion = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int j = i;
            Student B = array[i];
            while ((j > 0) && (array[j - 1].getGrade() > B.getGrade())) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        long endTimeInsertion = System.nanoTime();
        totalTimeInsertion = endTimeInsertion - startTimeInsertion;
        return array;
    }
}
