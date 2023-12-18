package edu.hcc.MySpringProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class StudentController {

    @GetMapping("/students")
    public List<Course>  students() throws IOException {
        return readData();
    }


    @GetMapping("/student/{couseNo}")
    public Student  book(@PathVariable String first_name) throws IOException {
        System.out.println("search student by course : "+ students());
        List<Course>  courses = readData();
        for(Course student : courses){
            if( student.getCourseNo().equalsIgnoreCase(courses)){
                System.out.println("found first name "+ student);
                return courses;
            }
        }
        System.out.println(" No student found for name "+ courses;
        return null;
    }  @GetMapping("/student")
    public Student  book(@RequestParam String first_name, @RequestParam String courseNo) throws IOException {
        System.out.println("search book by first name : "first_name+" Course Number : "+courseNo);
        List<Student>  students = readData();
        for(Student student : students){
            if( student.getFirst_name().equalsIgnoreCase(first_name) & student.getFirst_name().getClass(0).getName().equalsIgnoreCase(courseNo)){
                System.out.println("found Student "+student);
                return student;
            }
        }
        System.out.println(" No student found for Course Number "+courseNo);
        return null;
    }



    public List<Student> readData() throws IOException {
        FileReader fileReader = new FileReader("https://hccs-advancejava.s3.amazonaws.com/student_course.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Student> studentsList = new ArrayList();
        List<Course> authors = new ArrayList();

        String header = bufferedReader.readLine(); // read the header
        String line = bufferedReader.readLine(); // read the first line
        while ( line != null){
            String[] data = line.split(",");// split each read line by comma
            students() = new students data[2]);
            studentsList.add(students());
            Student student = new students(data[0],Integer.parseInt(data[1]),students, null);
            studentsList.add(student);
            line = bufferedReader.readLine();
            studentsList() = new ArrayList();
        }
        return studentsList;
    }
}

