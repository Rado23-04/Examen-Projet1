package com.examen.Projet1.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionVerite {
    private String affirmation;
    private boolean vraiOuFaux;
}
