package eu.horyzont.gradebook.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String type;
    @NotBlank
    private int ects;
    @ManyToOne
    private Teacher teacher;
    @NotBlank
    private int hours;
    private String description;
}
