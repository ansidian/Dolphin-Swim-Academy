package cs3220.hw3.service;

import cs3220.hw3.model.Classes;
import cs3220.hw3.repository.ClassesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {

    private final ClassesRepository classesRepository;

    public ClassesService(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }

    public List<Classes> getClasses() {
        return classesRepository.findAll();
    }

    public List<Classes> getClassesBySession(Integer session) {
        return classesRepository.findBySession(session);
    }

    public Classes addClass(Classes newClass) {
        return classesRepository.save(newClass);
    }

    public Classes getClassById(Long id) {
        return classesRepository.findById(id)
                .orElse(null);
    }
}