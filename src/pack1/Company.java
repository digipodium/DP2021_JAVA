package pack1;

public class Company {
    public static void main(String[] args) {
        Department accounts = new Department("Accounts", "account related work", 0);
        Department sales = new Department("Sales", "handles the sales data of company", 0);
        Employee e1 = new Employee("Alex Mason", "N/a", sales, "Manager", "S001");
        Employee e2 = new Employee("Ravi Prasad", "Kanpur", sales, "Asst. Manager", "S002");
        Employee e3 = new Employee("Ajay Kumar", "Kanpur", sales, "Assistant 3,", "S003");
        sales.totalEmp = 3;
        Employee e4 = new Employee("Akash singh", "Lucknow", accounts, "S.O", "A001");
        Employee e5 = new Employee("Akash verma", "Lucknow", accounts, "Assistant 1", "A002");
        Employee e6 = new Employee("Akash garg", "Lucknow", accounts, "Assistant 3", "A003");
        accounts.totalEmp = 3;

        sales.show();
        e1.show();
        e2.show();
        e3.show();
        accounts.show();
        e4.show();
        e5.show();
        e6.show();

    }
}
