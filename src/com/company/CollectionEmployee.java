package com.company;

import java.util.*;

public class CollectionEmployee {
    private static List<Employee> listeEmploye=
            new ArrayList<>();
    private static SortedMap<Integer,Employee> mapEmploye=
            new TreeMap<Integer,Employee>();

    // fonction permettant d’ajouter un Employe dans la liste
    public static void ajouterEmployeListe(Employee employe) {

        listeEmploye.add(employe);
    }
    // fonction permettant de supprimer un Employe dans la liste
    public static boolean supprimerEmployeListe(int matricule) {
            for (Employee emp:listeEmploye)
                if(emp.getMatricule()==matricule)
                    return listeEmploye.remove(emp);
            return false;
    }
// fonction permettant de renvoyer un Employe dans la liste

    public static Employee renvoyerEmployeListe(int matricule){
        for (Employee emp:listeEmploye)
            if(emp.getMatricule()==matricule)
                return emp;
        return null;
    }

    // fonction permettant d’afficher les Employes de la liste
    public void afficherEmployeListe(){
        Iterator<Employee> it=listeEmploye.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void ajouterEmployeMap(Employee employe) {
        mapEmploye.put(employe.getMatricule(), employe);

    }
// fonction permettant de supprimer un Employe dans la map

    public static boolean supprimerEmployeMap(int matricule){
       return  mapEmploye.remove(matricule)!=null;
    }
// fonction permettant de renvoyer le premier Employe dans la // map

    public static Employee renvoyerPremierEmployeMap(){
        int mat=mapEmploye.firstKey();
        return  mapEmploye.get(mat);
    }

    public void afficherMaptriculeEmployeMap(){
        Set<Map.Entry<Integer,Employee>> set = mapEmploye.entrySet();
        Iterator<Map.Entry<Integer,Employee>> it=set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,Employee> entry=it.next();
            System.out.println(entry.getKey()+"+"+entry.getValue());


    }

}









}
