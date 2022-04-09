package co.edu.umanizales.api_students.service;

import co.edu.umanizales.api_students.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students;

    public List<Student> getAllStudents()
    {
        students = new ArrayList<>();
        students.add(new Student("12353454", (byte) 1,
                200000.23,true,"Carlos Loaiza"));
        students.add(new Student("33443434",(byte)2,
                0,false,"Sandra Suárez"));
        students.add(new Student("56656565",(byte)1,
                5000000,true,"Pedro Pérez"));

        return students;
    }
}