package org.naltos.gymtrackerapi.Repository;

import org.naltos.gymtrackerapi.Entity.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
}
