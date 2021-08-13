package pack1;

public class Department {
    public String title;
    public String description;
    public int totalEmp;

    public Department(String title, String description, int totalEmp) {
        this.title = title;
        this.description = description;
        this.totalEmp = totalEmp;
    }

    public void show() {
        System.out.println("DEPT DETAILS");
        System.out.println(title);
        System.out.println(description);
        System.out.println(totalEmp);
    }

    public void increaseEmp() {
        totalEmp += 1;
    }

    public void decreaseEmp() {
        totalEmp -= 1;
    }
}
