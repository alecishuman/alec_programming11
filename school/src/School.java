import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private String name;
    private String location;
    private int phone;

    public School(String name, String location, int phone, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void addTeacher(Teacher newTeacher) {
        this.teachers.add(newTeacher);
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public void deleteTeacher(Teacher delete) {
        this.teachers.remove(delete);
    }

    public void deleteStudent(Student delete) {
        this.students.remove(delete);
    }

    public void showTeachers() {
        for (Teacher teacher: this.teachers) {
            System.out.println(teacher);
        }
    }

    public void showStudents() {
        for (Student student: this.students) {
            System.out.println(student);
        }
    }
}
