package org.naltos.gymtrackerapi.Services.Exercises;

import jakarta.transaction.Transactional;
import org.naltos.gymtrackerapi.DTO.ExerciseDto.ExerciseDto;
import org.naltos.gymtrackerapi.Entity.Exercise;

import java.util.List;

public interface ExerciseService {
    @Transactional
    Exercise saveExercise(ExerciseDto dto);

    List<Exercise> findByUserId(Long userId);

    Exercise updateExercise(Exercise exercise, Long userId);

    void deleteExercise(Long exerciseId);
}
