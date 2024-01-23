package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    @ManyToOne
    private Student student;
    @NotBlank
    @ManyToOne
    private Course course;
    private float grade;
    private int attempt;
    private LocalDate gradeDate;
}
