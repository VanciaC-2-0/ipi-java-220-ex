package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Technicien extends Employe {

    public Technicien() {
    }

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.grade = grade;
    }


    private Integer grade;

    @Override
    public void setSalaire(Double salaire) {
        super.setSalaire(salaire * (1 + (double) grade / 10));
    }

    @Override
    public Integer getNbConges() {
        return super.getNbConges() + super.getNombreAnneeAnciennete();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }



}
