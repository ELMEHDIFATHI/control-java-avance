package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import  static  com.company.Employee.Departement;

import static java.util.Arrays.*;

public class ExpressionLmabda {
    private static List<Employee> liste =  asList(
            new Employee("Charkaoui", "Mouna", 2354, 15000, Departement.ACHAT),
            new Employee("Erraji", "Zineb", 7685, 25000, Departement.INFORMATIQUE),
            new Employee("Naji", "Mohammed", 3097, 10000, Departement.RH),
            new Employee("Kamri", "Houda", 1209, 30000, Departement.INFORMATIQUE),
            new Employee("Alaoui", "Adil", 5674, 35000, Departement.COMMERCIAL),
            new Employee("Mchari", "Karime", 2046, 2300, Departement.INFORMATIQUE));

    // function permettant de filtrer les employés suivant une
// condition
    public static List<Employee> filtrerEmployes(Predicate<Employee> predicate){
        List<Employee> nvList=new ArrayList<>();
        liste.forEach(emp->{
            if(predicate.test(emp))
                nvList.add(emp);
        });

        return nvList;
    }

    public static void main(String[] args) {

        // à l’aide des classes anonymes, implémenter un Comparator
        Comparator<Employee> comp1 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getMatricule()- o2.getMatricule();
            }
        };

// à l’aide des expressions lambdas, implémenter un Comparator

        Comparator<Employee> comp2=(e1,e2)-> e1.getMatricule()- e2.getMatricule();
// à l’aide des expressions lambdas, récupérer les employés
// appartenant au département informatique

        List<Employee> employesInformatique = filtrerEmployes(emp->emp.getDepartement() ==Departement.INFORMATIQUE);

// à l’aide des expressions lambdas, afficher ces employés

        employesInformatique.forEach(employee -> System.out.println(employee));

// à l’aide des expressions lambdas, récupérer les employés
// ayant un salaire supérieur ou égal à 2000

        List<Employee> employesSalaireSup2000 =filtrerEmployes(emp->emp.getSalaire() >=2000);

// à l’aide des expressions lambdas, afficher ces employés

        employesSalaireSup2000.forEach(employee -> System.out.println(employee));


    }

}
