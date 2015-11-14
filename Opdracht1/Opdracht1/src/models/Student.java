package models;

public class Student {

    private int studentNummer;
    private String cijfer;

    public Student(int studentNummer, String cijfer) {
        this.studentNummer = studentNummer;
        this.cijfer = cijfer;
    }

    public Student() {

    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public String getCijfer() {
        return cijfer;
    }

    public void setCijfer(String cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return studentNummer + "\t" + cijfer;
    }
}