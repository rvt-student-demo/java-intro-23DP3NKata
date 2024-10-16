package student_registration;

public class Student {
    private String firstname;
    private String lastname;
    private String email;
    private String group;

    public Student(String firstname, String lastname, String email, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.group = group;
    }

    public String toCsvString() {
        return String.format("%s,%s,%s,%s", firstname, lastname, email, group);
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Email: %s, Group: %s", firstname, lastname, email, group);
    }
}
