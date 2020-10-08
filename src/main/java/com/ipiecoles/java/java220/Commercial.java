package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;



public class Commercial extends Employe{

    private Double caAnnuel = 0d;

    private Integer performance;

    public Commercial(){
        super();
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
        this.performance = performance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;
        return Objects.equals(caAnnuel, that.caAnnuel) && Objects.equals(performance, that.performance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caAnnuel, performance);
    }

    public Commercial(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }


    @Override
    public Double getPrimeAnnuelle() {
        if(this.caAnnuel != null){
            return Math.max(Math.ceil(this.caAnnuel * 0.05), 500d);
        }
        return 500d;
    }

    public boolean performanceEgale(Integer performance){
        if(this.performance.equals(performance)){
            return true;
        }
        else{
            return false;
        }
    }

    public Note equivalenceNote(){
        switch (performance) {
            case 0:
            case 50:
                return Note.INSUFFISANT;
            case 100:
                return Note.PASSABLE;
            case 150:
                return Note.BIEN;
            case 200:
                return Note.TRES_BIEN;
            default:
                return null;
        }
    }

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }
}
