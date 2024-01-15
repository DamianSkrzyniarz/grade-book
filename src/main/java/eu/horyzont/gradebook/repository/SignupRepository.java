package eu.horyzont.gradebook.repository;

import eu.horyzont.gradebook.entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer> {
}
