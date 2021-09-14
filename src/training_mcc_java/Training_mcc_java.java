/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_mcc_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class Training_mcc_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Employee> employees = Arrays.asList(new Employee[]{
            new Employee("E0001", "Dev", "IT Trainer"),
            new Employee("E0002", "Cakra", "Application Developer"),
            new Employee("E0003", "Johan", "IT Trainer"),
            new Employee("E0004", "Kintan", "Application Developer"),
            new Employee("E0005", "Aldyth", "Admin"),
            new Employee("E0006", "Athifah", "Application Developer"),
            new Employee("E0007", "David", "Admin"),
            new Employee("E0008", "Dyas", "Application Developer"),
            new Employee("E0009", "Atika", "Application Developer"),
            new Employee("E00010", "Sendy", "Admin"),
            new Employee("E00011", "Rizky", "Application Developer"),
            new Employee("E00012", "Idris", "Application Developer"),
            new Employee("E00013", "Abi", "Admin"),
            new Employee("E00014", "Arya", "Application Developer")
        });
        
        //Enhanced For Loop (not Foreach)
        for (Employee e : employees) {
            System.out.println("Id : " + e.getId());
            System.out.println("Nama : " + e.getNama());
            System.out.println("Jabatan : " + e.getJabatan());
            System.out.println("=====================");
        }
        
        //Java Stream(Filter, Map, Find First)
        List<Employee> newEmployees = employees.stream().
                filter(e -> e.getJabatan().equals("IT Trainer")).
                collect(Collectors.toList());
        
        Predicate<Employee> condition = e -> e.getJabatan().equals("Admin");
        List<Employee> newEmployees2 = employees.stream().
                filter(condition).
                collect(Collectors.toList());
        
        for (Employee newEmployee : newEmployees) {
            System.out.println(newEmployee);
        }
        
        for (Employee employee : newEmployees2) {
            System.out.println(employee);
        }
    }
}
