public class Person {
     private  String personName;
     private int personAge;
     private double personSalary;
     private Department personDepart;
     
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public int getPersonAge() {
        return personAge;
    }
    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
    public double getPersonSalary() {
        return personSalary;
    }
    public void setPersonSalary(double personSalary) {
        this.personSalary = personSalary;
    }
    public Department getPersonDepart() {
        return personDepart;
    }
    public void setPersonDepart(Department personDepart) {
        this.personDepart = personDepart;
    }


    @Override
    public String toString() {
       // System.out.printf(" %20s, %7s, %8s, %8s, %s", "    Имя сотрудника", "Возраст", "Зарплата", "Отдел", "\n");
        return String.format(" %20s, %7s, %8s, %11s, %s", personName, String.valueOf(personAge) ,String.valueOf(personSalary), personDepart.getNameDepurtment(), "\n");


    }


    public static String[] getTestNamesList(){
        String[] testNamesList = {"Виктор Семенов", "Ришат Назметдинов", "Вероника Попова",
                                "Петр Левин", "Николай Рогов", "Елена Лапина", "Семен Карпов", 
                                "Константин Смирнов", "Игорь Кораблев", "Вероника Климова", 
                                "Руслан Гершин", "Глеб Нефедов"};
        return testNamesList;
    }
    
}
