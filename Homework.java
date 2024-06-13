import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class Homework {
List <Person> personList = new ArrayList<>();
    public static void fillingPersonList(List<Person> personList){
        
       
        for (String item : Person.getTestNamesList()) {
            Person person = new Person();
            Department department = new Department();
            person.setPersonName(item);
            person.setPersonAge(ThreadLocalRandom.current().nextInt(19, 65));
            person.setPersonSalary(ThreadLocalRandom.current().nextDouble(20_000, 105_000));
            department.setNameDepurtment(department.getTestDepartmentsList()
                                        [ThreadLocalRandom.current().nextInt
                                        (department.getTestDepartmentsList().length)]);
            person.setPersonDepart(department);
            personList.add(person);
        }
        System.out.println(personList);
    }

    
   
    /**
    * Найти самого молодого сотрудника
    */
    static Optional <Person> findMostYoungestPerson(List<Person> people) {
        return people.stream().min((o1,o2) -> Integer.compare(o1.getPersonAge(), o2.getPersonAge()));
    }
    
    /**
    * Найти департамент, в котором работает сотрудник с самой большой зарплатой
    */
    static Optional<Department> findMostExpensiveDepartment(List<Person> people) {
    return people.stream()
        .max((o1,o2) -> Double.compare(o1.getPersonSalary(), o2.getPersonSalary()))
        .map(b -> b.getPersonDepart());
    }
    
    /**
    * Сгруппировать сотрудников по департаментам
    */
    static Map <Department, List<Person>> groupByDepartment(List<Person> people) {
    return people.stream()
        .collect(Collectors.groupingBy(it -> it.getPersonDepart()));
    }
    
    /**
    * Сгруппировать сотрудников по названиям департаментов
    */
    static Map<String, List<Person>> groupByDepartmentName(List<Person> people) {
        return people.stream()
            .collect(Collectors.groupingBy(it -> it.getPersonDepart().getNameDepurtment()));
    }
    
    /**
    * В каждом департаменте найти самого старшего сотрудника
    */
    static Map<String, Person> getDepartmentOldestPerson(List<Person> people) {
        return people.stream()
            .collect(Collectors.toMap(b -> b.getPersonDepart().getNameDepurtment(), 
                b -> b, 
                (a, b) -> {
                    if (a.getPersonAge() > b.getPersonAge()){
                        return a;
                    } 
                    return b;
                    }
                ));
    }
    
    /**
    * *Найти сотрудников с минимальными зарплатами в своем отделе
    * (прим. можно реализовать в два запроса)
    */
    static List<Person> cheapPersonsInDepartment(List <Person> people) {
         Map<String, Person> cheaperPerson = people.stream()
        .collect(Collectors.toMap(b -> b.getPersonDepart().getNameDepurtment(), 
            b -> b, 
            (a, b) -> {
                if (a.getPersonSalary() < b.getPersonSalary()){
                    return a;
                } 
                return b;
                }
            ));
        return cheaperPerson.values().stream()
            .collect(Collectors.toList());
    }
}