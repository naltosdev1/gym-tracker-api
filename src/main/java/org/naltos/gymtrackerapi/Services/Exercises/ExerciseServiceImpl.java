package org.naltos.gymtrackerapi.Services.Exercises;

import jakarta.transaction.Transactional;
import org.naltos.gymtrackerapi.DTO.ExerciseDto.ExerciseDto;
import org.naltos.gymtrackerapi.Entity.Exercise;
import org.naltos.gymtrackerapi.Entity.User;
import org.naltos.gymtrackerapi.Repository.ExerciseRepository;
import org.naltos.gymtrackerapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public Exercise saveExercise(ExerciseDto dto) {
        User user = userRepository.findById(dto.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));

        Exercise exercise = new Exercise();
        exercise.setPullup(dto.getPullup());
        exercise.setDips(dto.getDips());
        exercise.setPushup(dto.getPushup());
        exercise.setUser(user);

        return exerciseRepository.save(exercise);
    }

    @Override
    public List<Exercise> findByUserId(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return user.getExercises();
    }

    @Override
    public Exercise updateExercise(ExerciseDto exercise, Long userId) {
        return null;
    }

    @Override
    public void deleteExercise(Long exerciseId) {

    }
}
