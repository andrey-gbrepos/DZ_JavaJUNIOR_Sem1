public class Department {
    private String nameDepurtment;

    public String getNameDepurtment(){
        return this.nameDepurtment;
    }

    public void setNameDepurtment(String name){
        this.nameDepurtment = name;
    }

    public String[] getTestDepartmentsList(){
        String[] departments = {"accounting", "hr", "develop", "service"};
        return departments;
    }

    @Override
    public String toString() {
        return "Department [nameDepurtment=" + nameDepurtment + "]";
    }



}
