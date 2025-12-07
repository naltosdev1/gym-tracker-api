package org.naltos.gymtrackerapi.Controllers.Exercises;

import jakarta.validation.Valid;
import org.naltos.gymtrackerapi.DTO.ExerciseDto.ExerciseDto;
import org.naltos.gymtrackerapi.Entity.Exercise;
import org.naltos.gymtrackerapi.Services.Exercises.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public Exercise addExercise(@Valid @RequestBody ExerciseDto exercise) {
        return exerciseService.saveExercise(exercise);
    }
}
