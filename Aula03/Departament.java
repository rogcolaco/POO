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
    public void printState() {
        System.out.println(this.name + "\t" + this.location + "\t" + this.code + "\t" + this.phoneExtention + "\t" + this.budget + "\t");
        for (Employee i : this.getEmployees()) {
            if (i.name == "set") {
                break;
            } else {
                System.out.println(i.id + "\t"+i.name);
            }
        }
    }

    public void addEmployee(Employee employee){
        for (Employee i : this.getEmployees()){
            if(i.name=="set"){
                i.name=employee.name;
                i.id= employee.id;
                i.departament=employee.departament;
                i.salary=employee.salary;
                i.jobTitle=employee.jobTitle;
                break;
            }
        }

    }

    /*public void removeEmployee(Employee employee){
        for (Employee i : this.getEmployees()){
            if(i.id==employee.id){
                i.name=employee.name;
                i.id= employee.id;
                i.departament=employee.departament;
                i.salary=employee.salary;
                i.jobTitle=employee.jobTitle;
                break;
            }
        }

    }*/

    public int sizeOfEmployees(){
        int count;

        count=0;
        for(Employee i : this.getEmployees()){
            if(i.name=="set") {
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
