package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @ManyToOne
    private Teacher teacher;
}
