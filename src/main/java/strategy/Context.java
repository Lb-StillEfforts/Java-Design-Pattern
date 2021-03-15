package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 策略模式的控制策略者
public class Context<T> {

    private SortStrategy<T> sortStrategy;

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortMethod(ArrayList<T> arrayList, Comparator<T> comparator) {
        sortStrategy.sort(arrayList, comparator);
    }
}
