package opdracht1;

import java.text.DecimalFormat;
import java.util.Random;
import models.Student;
import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

public class Opdracht1 {

    public static void main(String[] args) {
        // Variables for student numbers and amount of students to be generated
        int studentnummer = 50060001;
        int aantalLeerlingen = 20;
        
        // Creating the student array
        Student[] studenten = new Student[aantalLeerlingen];

        // Initiate and format random generator for grades
        Random r = new Random();
        DecimalFormat df = new DecimalFormat(".0");
        
        // Filling the student array with student numbers and random grades
        for (int i = 0; i < studenten.length; i++) {
            Student s = new Student();
            s.setStudentNummer(studentnummer);
            studentnummer++;
            double cijfer = 1.0 + (10.0 - 1.0) * r.nextDouble();
            String result = df.format(cijfer);
            s.setCijfer(result);
            
            studenten[i] = s;
        }
        
        // Shuffling the student array
        StdRandom.shuffle(studenten);
        
        // Print out shuffled list of students
        System.out.println("Shuffled list\nStudentNummer\tCijfer");
        for (Student s : studenten) {
            System.out.println(s);
        }
    }
}
