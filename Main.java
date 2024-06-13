import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Homework homework = new Homework();
    List <Person> personList = new ArrayList<>();

    Homework.fillingPersonList(personList);

    System.out.println("Yanger Person: ");
    System.out.println(Homework.findMostYoungestPerson(personList));

    System.out.println("Expansive Department: ");
    System.out.println(Homework.findMostExpensiveDepartment(personList));
    

    System.out.println("GroupBy Department: ");
    System.out.println(Homework.groupByDepartment(personList));

    System.out.println("GroupBy DepartmentName: ");
    System.out.println(Homework.groupByDepartmentName(personList));


    System.out.println("oldestPerson: ");
    System.out.println(Homework.getDepartmentOldestPerson(personList));


    System.out.println("cheaperPerson: ");
    System.out.println(Homework.cheapPersonsInDepartment(personList));

    }
   

}
