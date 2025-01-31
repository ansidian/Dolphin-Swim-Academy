package cs3220.hw3.repository;

import cs3220.hw3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySession(Integer session);
}
