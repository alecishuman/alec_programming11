public class Student {
    private String first;
    private String last;
    private int grade;

    public Student(String first, String last, int grade) {
        this.first = first;
        this.last = last;
        this.grade = grade;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + first + " " + last + " Grade: " + grade;
    }
}
