package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String value;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
}
