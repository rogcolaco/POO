public class Departament {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    String name, location;
    int code, phoneExtention;
    double budget;
    Employee[] employee = new Employee[10];

    //CONSTRUCTORS
    public Departament(String name, int code) {
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

    public Employee[] getEmployees() {
        return employee;
    }

    public void setEmployees(Employee[] employees) {
        this.employee = employees;
    }

    //METHODS
    public void printState(){
        System.out.println(this.name+"\t"+this.location+"\t"+this.code+"\t"+this.phoneExtention+"\t"+this.budget+"\t"+this.getEmployees()[0].id);
    }

    public int sizeOfEmployees(){
        int count;

        count=0;
        for(Employee i : this.getEmployees()){
            if(i.name=="null") {
                System.out.println(i.name);
                break;
            }
            else{
                System.out.println(i.id);
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
}
