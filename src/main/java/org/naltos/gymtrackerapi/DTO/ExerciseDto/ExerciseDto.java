package org.naltos.gymtrackerapi.DTO.ExerciseDto;

import lombok.Data;

@Data
public class ExerciseDto {
    private int pullup;
    private int dips;
    private int pushup;
    private Long userId;
}
