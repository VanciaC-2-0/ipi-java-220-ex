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

    public static void setDateEmbauche(LocalDate dateEmbauche) {
        Employe.dateEmbauche = dateEmbauche;
    }

    public static void setSalaire(Double salaire) {
        Employe.salaire = salaire;
    }
}
