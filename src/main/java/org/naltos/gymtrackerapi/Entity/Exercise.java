package org.naltos.gymtrackerapi.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int pullup;
    private int dips;
    private int pushup;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private User user;
}
