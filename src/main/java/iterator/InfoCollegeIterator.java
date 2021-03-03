package iterator;

import java.util.Iterator;
import java.util.List;

// 信息工程学院
public class InfoCollegeIterator implements Iterator {

    private List<Department> departments; // 以list形式存放
    private int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index++;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
