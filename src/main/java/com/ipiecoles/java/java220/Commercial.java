package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Commercial extends Employe{

    private Double caAnnuel = 0d;

    public Commercial(){

    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }


    @Override
    public Double getPrimeAnnuelle() {
        return Math.max(Math.ceil(this.getCaAnnuel() * 0.05), 500);
    }

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }
}
