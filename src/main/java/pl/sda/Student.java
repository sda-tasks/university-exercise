package pl.sda;

public class Student {
    public static int studentsNumber;

    private String firstName;
    private String lastName;
    private int index;


    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        studentsNumber++;
    }
}
