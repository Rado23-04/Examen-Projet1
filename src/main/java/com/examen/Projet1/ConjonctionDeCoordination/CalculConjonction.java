package com.examen.Projet1.ConjonctionDeCoordination;

import com.examen.Projet1.Affirmation.QuestionVerite;

public class CalculConjonction {
    public boolean calcul (QuestionVerite premierAffiramtion , QuestionVerite secondAffirmation, ConjonctionsDeCoordinations conjonctionsDeCoordinations ) {
        if (conjonctionsDeCoordinations.equals("et") && premierAffiramtion.isVraiOuFaux() == true && secondAffirmation.isVraiOuFaux() == true) {

            return true;

        }
        if (conjonctionsDeCoordinations.equals("ou") && premierAffiramtion.isVraiOuFaux() || secondAffirmation.isVraiOuFaux() == true) {

            return true;

        }
        if (conjonctionsDeCoordinations.equals("donc") && premierAffiramtion.isVraiOuFaux() == true && secondAffirmation.isVraiOuFaux()== false) {

            if(premierAffiramtion.isVraiOuFaux()!=true){
                return true;
            }
        }

        return false;
    }

}
