package co.edu.umanizales.api_students.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Student {
    private String identification;
    private byte gender;
    private double salary;
    private boolean job;
    private String name;

}