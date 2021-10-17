package pl.sda;

public class University {

    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Student.studentsNumber);
        Student s1 = new Student("Włodek", "Markowski", 3455456);
        Student s2 = new Student("Kuba", "Kowalski", 7677656);
        System.out.println("Liczba studentów po zapisach: " + Student.studentsNumber);
    }
}
