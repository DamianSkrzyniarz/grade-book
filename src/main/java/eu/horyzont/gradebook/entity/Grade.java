package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String value;
    @ManyToOne
    Student student;
    @ManyToOne
    Course course;
}
