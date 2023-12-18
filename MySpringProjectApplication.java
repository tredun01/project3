package edu.hcc.MySpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class MySpringProjectApplication {
    private static void extracted(ConfigurableApplicationContext context) throws IOException {

        Student student = context.getBean(Student.class);
        System.out.println(" student "+ student.readData());

    }
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(MySpringProjectApplication.class, args);
        extracted(context);

    }
}



