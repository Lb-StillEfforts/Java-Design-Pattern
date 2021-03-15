package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 冒泡排序
public class BubbleSort implements SortStrategy {


    @Override
    public void sort(ArrayList arrayList, Comparator comparator) {

        Object temp;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 1; j < arrayList.size() - i; j++) {
                if (comparator.compare(arrayList.get(j), arrayList.get(j - 1)) == 1) {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j - 1));
                    arrayList.set(j - 1, temp);
                }
            }
        }
    }
}
