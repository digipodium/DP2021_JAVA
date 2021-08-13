package pack1;

public class Employee {

    public static final String COMPANY = "ABC ltd";
    public String name;
    public String address;
    public Department dept;
    public String designation;
    public String id;

    public Employee(String name, String address, Department dept, String designation, String id) {
        this.name = name;
        this.address = address;
        this.dept = dept;
        this.designation = designation;
        this.id = id;
    }

    public void show(){
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println("Name:"+name);
        System.out.println("Addr:"+address);
    }

}
