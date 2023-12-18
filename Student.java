package edu.hcc.MySpringProject;

public class Student
{
    private int id;
    private String first_name;
    private String email;
    private String gender;
    private double gpa;
    public Student(int id,String first_name, String email, String gender, double gpa) {
        this.id =id;
        this.first_name = first_name;
        this.email = email;
        this.gender = gender;
        this.gpa = gpa;
    }
    public Student() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGpa(){
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +",first_name=" + first_name + ", email=" + email + ", gender="
                + gender + , gpa=" + gpa + "]";
    }
}