package eu.horyzont.gradebook.repository;


import eu.horyzont.gradebook.entity.Student;
import eu.horyzont.gradebook.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {


    List<Teacher> findByFirstNameOrLastNameContainingIgnoreCase(String firstName, String lastName);
}
