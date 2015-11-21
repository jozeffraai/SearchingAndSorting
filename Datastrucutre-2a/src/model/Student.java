/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Joost
 */
public class Student implements Comparable{
    
    private int studentNr;
    private double grade;
   
    
    public Student(int studentNr , double grade) {
        this.studentNr = studentNr;
        this.grade = grade;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNr=" + studentNr + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Object t) {
        Student student = (Student) t;
        if(this.grade == student.grade){
            return Integer.compare(this.studentNr, student.studentNr);
        }
        return Double.compare(this.grade, student.grade);
    }
}
