package cs3220.hw3.repository;


import cs3220.hw3.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassesRepository extends JpaRepository<Classes, Long> {
    List<Classes> findBySession(Integer session);
}
