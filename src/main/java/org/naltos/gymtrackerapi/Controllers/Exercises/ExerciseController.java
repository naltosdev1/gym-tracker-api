package org.naltos.gymtrackerapi.Controllers.Exercises;

import jakarta.validation.Valid;
import org.naltos.gymtrackerapi.DTO.ExerciseDto.ExerciseDto;
import org.naltos.gymtrackerapi.Entity.Exercise;
import org.naltos.gymtrackerapi.Services.Exercises.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public Exercise addExercise(@Valid @RequestBody ExerciseDto exercise) {
        return exerciseService.saveExercise(exercise);
    }

    @GetMapping("/{user_id}")
    public List<Exercise> getExercise(@PathVariable("user_id") Long userId) {
        return this.exerciseService.findByUserId(userId);
    }
}
