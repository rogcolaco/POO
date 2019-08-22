public class Employee {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    String name, location;
    int code, phoneExtention;
    double budget;

    //CONSTRUCTORS
    public Employee(int code) {
        this.code = code;
    }

    public Employee(String name, int code) {
        this.name = name;
        this.code = code;
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

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
