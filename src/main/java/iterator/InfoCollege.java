package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    private List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<Department>();
        addDepartment("信息工程", "信息工程");
        addDepartment("通信工程", "通信工程");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String descript) {
        departments.add(new Department(name, descript));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
