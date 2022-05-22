package com.company;

public class Employee implements Cloneable{
    private String nom,prenom;
    private int matricule;
    private double salaire;
    private Departement departement;


    public static enum Departement{
       ACHAT(2000) ,COMMERCIAL(3000),INFORMATIQUE(5000),RH(2000);
       private final int primeAnnulle;
       private Departement(int primeAnnulle){
           this.primeAnnulle=primeAnnulle;
       }



    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Employee(String nom, String prenom, int matricule, double salaire, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.salaire = salaire;
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule=" + matricule +
                ", salaire=" + salaire +
                ", departement=" + departement +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee  emp=(Employee) obj;
            return emp.matricule==this.matricule;
        }
        return false;
    }

    @Override
    protected Employee clone() {
        try{
            return (Employee) super.clone();
        }catch (Exception E){
            System.out.println("eureru de clon,age");
        }
        return null;

    }

    public void afficherPrimeDepartement(){
        for (Departement d:Departement.values()){
            System.out.println(d+""+departement.primeAnnulle);
        }
    }
}
