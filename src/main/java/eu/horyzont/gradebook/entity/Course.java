package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;
    @ManyToOne
    Teacher teacher;
}
