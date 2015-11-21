/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

import model.Student;
import java.util.Comparator;

/**
 *
 * @author Joost
 */
public class StudentCompare {

    public Comparator studentNrCompare() {
        return new studentNrCompare();
    }

    public Comparator gradeCompare() {
        return new gradeCompare();
    }

    private class studentNrCompare implements Comparator {

        @Override
        public int compare(Object t, Object t1) {
            Student a = (Student) t;
            Student b = (Student) t1;
            return (a.getStudentNr() - b.getStudentNr());
        }

    }

    private class gradeCompare implements Comparator {

        @Override
        public int compare(Object t, Object t1) {
            Student a = (Student) t;
            Student b = (Student) t1;
            double result = (a.getGrade() - b.getGrade());
            if (result == 0) {
                return 0;
            } else if (result > 1) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}
