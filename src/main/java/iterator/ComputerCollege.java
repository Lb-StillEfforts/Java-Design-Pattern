package iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    private Department[] departments;
    private int numOfDepartment = 0;

    public ComputerCollege() {
        // 暂定5个
        this.departments = new Department[5];
        addDepartment("计算机科学与技术", "计算机科学与技术");
        addDepartment("软件工程", "软件工程");
        addDepartment("网络工程", "网络工程");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String descript) {
        departments[numOfDepartment] = new Department(name, descript);
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    public int getNumOfDepartment() {
        return numOfDepartment;
    }

    public void setNumOfDepartment(int numOfDepartment) {
        this.numOfDepartment = numOfDepartment;
    }
}
