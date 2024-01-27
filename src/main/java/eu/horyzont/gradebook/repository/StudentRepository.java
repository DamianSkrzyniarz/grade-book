package eu.horyzont.gradebook.repository;

import eu.horyzont.gradebook.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByIndex(int index);

    Student findByAccountEmail(String email);

    List<Student> findAllByMajor(String major);

    List<Student> findByFirstNameOrLastNameContainingIgnoreCase(String firstName, String lastName);
}
