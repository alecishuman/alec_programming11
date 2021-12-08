public class Teacher {
    private String first;
    private String last;
    private String subject;

    public Teacher(String first, String last, String subject) {
        this.first = first;
        this.last = last;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Name: " + this.first + " " + this.last + " Subject: " + this.subject;

    }
}
