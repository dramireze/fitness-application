package dev.dramireze.fitnessapplication.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RunService {
    @Autowired
    private RunRepository runRepository;

    public List<Run> findAll() {
        return (List<Run>) runRepository.findAll();
    }

    public Optional<Run> findById(Integer id) {
        return runRepository.findById(id);
    }

    public void save(Run run) {
        runRepository.save(run);
    }


    public void delete(Run run) {
        runRepository.delete(run);
    }

}