package com.examen.Projet1;

import com.examen.Projet1.Affirmation.QuestionVerite;
import com.examen.Projet1.ConjonctionDeCoordination.CalculConjonction;
import com.examen.Projet1.ConjonctionDeCoordination.ConjonctionsDeCoordinations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculConjonctionTest {
    @Test
    void TestCalculOne (){
        QuestionVerite questionVerite = new QuestionVerite("Lou est pauvre", false);
        QuestionVerite questionVerite1 = new QuestionVerite("Lou est généreur", true);
        ConjonctionsDeCoordinations conjonctionsDeCoordinations = new ConjonctionsDeCoordinations("et");

        CalculConjonction calculConjonction = new CalculConjonction();

        boolean resultat = calculConjonction.calcul(questionVerite,questionVerite1,conjonctionsDeCoordinations);

        Assertions.assertTrue(resultat);
    }

    @Test
    void TestCalculTwo(){
        QuestionVerite questionVerite = new QuestionVerite("Lou est beau",true);
        QuestionVerite questionVerite1 = new QuestionVerite("Lou est pauvre", false);
        ConjonctionsDeCoordinations conjonctionsDeCoordinations = new ConjonctionsDeCoordinations("donc");

        CalculConjonction calculConjonction = new CalculConjonction();

        boolean resultat = calculConjonction.calcul(questionVerite, questionVerite1,conjonctionsDeCoordinations);

        Assertions.assertFalse(resultat);

    }

    @Test
    void TestCalculThree(){
        QuestionVerite questionVerite = new QuestionVerite("Lou est pauvre",false);
        QuestionVerite questionVerite1 = new QuestionVerite("Lou est genereux", false);
        ConjonctionsDeCoordinations conjonctionsDeCoordinations = new ConjonctionsDeCoordinations("donc");

        CalculConjonction calculConjonction = new CalculConjonction();

        boolean resultat = calculConjonction.calcul(questionVerite, questionVerite1,conjonctionsDeCoordinations);

        Assertions.assertFalse(resultat);
    }

    @Test
    void TestCalculFour(){
        QuestionVerite questionVerite = new QuestionVerite("Lou est beau",true);
        QuestionVerite questionVerite1 = new QuestionVerite("Lou est genereux", false);
        ConjonctionsDeCoordinations conjonctionsDeCoordinations = new ConjonctionsDeCoordinations("donc");

        CalculConjonction calculConjonction = new CalculConjonction();

        boolean resultat = calculConjonction.calcul(questionVerite, questionVerite1,conjonctionsDeCoordinations);

        Assertions.assertFalse(resultat);
    }

}
