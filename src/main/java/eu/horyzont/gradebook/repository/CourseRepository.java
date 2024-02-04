package eu.horyzont.gradebook.repository;

import eu.horyzont.gradebook.entity.Course;
import eu.horyzont.gradebook.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findByTeacherAccountEmail(String email);
}
