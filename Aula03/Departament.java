public class Departament {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    String name, location;
    int code, phoneExtention, empty;
    double budget;
    Employee[] employee = new Employee[10];

    //CONSTRUCTORS
    public Departament(int code) {
        this.code = code;
        this.empty = 0;
    }

    public Departament(String name, int code) {
        this.name = name;
        this.code = code;
        this.empty=0;
    }

    //SETS AND GETS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPhoneExtention() {
        return phoneExtention;
    }

    public void setPhoneExtention(int phoneExtention) {
        this.phoneExtention = phoneExtention;
    }

    public double getBudget() {
        return budget;
    }

    public int getEmpty() {
        return empty;
    }

    public void setEmpty(int empty) {
        this.empty = empty;
    }

    public Employee[] getEmployees() {
        return employee;
    }

    public void setEmployees(Employee[] employees) {
        this.employee = employees;
    }

    //METHODS
    public void printState(){
        System.out.println(this.name+"\t"+this.location+"\t"+this.code+"\t"+this.phoneExtention+"\t"+this.budget);
    }
}
