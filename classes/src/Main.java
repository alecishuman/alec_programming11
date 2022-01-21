import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School uhill = new School("UHill", "Ross Drive", 1234567890, new ArrayList<>(), new ArrayList<>());

        Student david = new Student("David", "Huang", 3);
        Student covid = new Student("Covid", "Luang", 8);
        Student felix = new Student("Felix", "Wu", 10);
        Student justin = new Student("Justin", "Wan", 12);
        Student alec = new Student("Alec", "Situ", 13);
        Student ceres = new Student("Dwarf", "Planet", 3000);
        Student coco = new Student("Coco", "Tsundere", 9);
        Student grant = new Student("Garnt", "Something", 12);
        Student joey = new Student("Joey", "Bitcoin", 12);
        Student connor = new Student("Connor", "Dawg", 6);
        uhill.addStudent(david);
        uhill.addStudent(covid);
        uhill.addStudent(felix);
        uhill.addStudent(justin);
        uhill.addStudent(alec);
        uhill.addStudent(ceres);
        uhill.addStudent(coco);
        uhill.addStudent(grant);
        uhill.addStudent(joey);
        uhill.addStudent(connor);

        Teacher daremba = new Teacher("Paul", "Zaremba", "Computer");
        Teacher kwong = new Teacher("Vincent", "Kwong", "Math & Physics");
        Teacher kwon = new Teacher("Linda", "Kwon", "English");
        uhill.addTeacher(daremba);
        uhill.addTeacher(kwong);
        uhill.addTeacher(kwon);

        uhill.deleteStudent(david);
        uhill.deleteStudent(felix);

        uhill.deleteTeacher(daremba);
        uhill.showStudents();
        uhill.showTeachers();
    }

}
