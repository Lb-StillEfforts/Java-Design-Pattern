package iterator;

import java.util.Iterator;

// 计算机学院
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null)
            return false;
        return true;
    }


    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void remove() {

    }
}
