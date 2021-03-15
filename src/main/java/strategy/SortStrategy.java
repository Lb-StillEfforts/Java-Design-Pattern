package strategy;

import java.util.ArrayList;
import java.util.Comparator;

public interface SortStrategy<T> {

    void sort(ArrayList<T> arrayList, Comparator<T> comparator);
}
