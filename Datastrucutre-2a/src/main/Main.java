/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Student;
import java.text.DecimalFormat;
import sort.BinarySearchTree;
import sort.QuicksortB;



public class Main {

    private static long totalTimeSorting;
    private static BinarySearchTree bst;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student[] students = generateStudents(10);
        Student key;
        int n;
        
        BinarySearchTree<Double, Integer> st = new BinarySearchTree<>();
        for (int i = 0; i < students.length; i++) {
            key = students[i];
            st.put(key.getGrade(), key.getStudentNr());
        }
       
       System.out.println("_____Get_____");
        
        for (int i = 0; i < students.length; i++) {
            n = st.get(students[i].getGrade());
            System.out.println(n);
        }
        
        long startTimeGen = System.currentTimeMillis();
        QuicksortB.sort(students, 0, students.length - 1);
        //QuicksortA.sort(students, 0, students.length-1);
        long endTimeGen = System.currentTimeMillis();
        
        System.out.println("_____Rank______");
        
        for (int i = 0; i < students.length; i++) {
            n = st.rank(students[i].getGrade());
            System.out.println(students[i].getGrade() + " " +n);
        }

        totalTimeSorting = endTimeGen - startTimeGen;

//        for(Student s : students)
//            System.out.println(s.toString());
        System.out.println("_____Time_______");
        System.out.println(totalTimeSorting);
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
        for (int i = 0; i < array.length; i++) {
            int j = i;
            Student B = array[i];
            while ((j > 0) && (array[j - 1].getGrade() > B.getGrade())) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        return array;
    }
}
