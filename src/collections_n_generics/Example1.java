package collections_n_generics;

import pack1.Department;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Department> deptList = new ArrayList<>();
        Department d1 = new Department("Accounts", "accounts department stuff", 10);
        deptList.add(d1);
        deptList.add(new Department("Sales", "sales related work", 13));
        deptList.add(new Department("Purchase", "some purchase stuff", 5));

        // traversing the whole collection object
        for (Department item : deptList) {
            System.out.println(item.title);
            System.out.println(item.description);
            System.out.println(item.totalEmp);
            System.out.println("----------------");
        }
        // getting item using index
        System.out.println(deptList.get(2).title);
        int size = deptList.size();
        if (size > 0) {
            System.out.println("we have " + size + " departments");
        }

        // removing elements from a list
        deptList.remove(d1);
        deptList.remove(1);
        System.out.println(deptList);
    }
}
