package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    private float grade;
    private int attempt;
    private LocalDate gradeDate;
}
