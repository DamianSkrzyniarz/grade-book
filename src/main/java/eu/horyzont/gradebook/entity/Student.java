package eu.horyzont.gradebook.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int index;
    private String firstName;
    private String lastName;
    private String major;
    private String semester;
}
