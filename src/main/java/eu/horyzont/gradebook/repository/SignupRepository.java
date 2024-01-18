package eu.horyzont.gradebook.repository;

import eu.horyzont.gradebook.entity.Signup;
import eu.horyzont.gradebook.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer>{
    public List<Signup> findByStudentId(int studentId);
}
