package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {

    private static String nom;

    private static String prenom;

    private static String matricule;

    private static LocalDate dateEmbauche;

    private static Double salaire;

    public Employe() {

    }

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public  final Integer getNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Employe{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", matricule='").append(matricule).append('\'');
        sb.append(", dateEmbauche=").append(dateEmbauche);
        sb.append(", salaire=").append(salaire);
        sb.append('}');
        return sb.toString();
    }

    public static String getNom() {
        return nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static String getMatricule() {
        return matricule;
    }

    public static LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public static Double getSalaire() {
        return salaire;
    }

    public static void setNom(String nom) {
        Employe.nom = nom;
    }

    public static void setPrenom(String prenom) {
        Employe.prenom = prenom;
    }

    public static void setMatricule(String matricule) {
        Employe.matricule = matricule;
    }

    public static void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
        if (dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }
        Employe.dateEmbauche = dateEmbauche;
    }

    public static void setSalaire(Double salaire) {
        Employe.salaire = salaire;
    }
}
