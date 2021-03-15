package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 希尔排序 - 非稳定排序
public class ShellSorting implements SortStrategy {
    @Override
    public void sort(ArrayList arrayList, Comparator comparator) {

         Object temp;
        int j = 0;

        for (int step = arrayList.size() / 2; step > 0; step /= 2) {
            for (int i = step; i < arrayList.size(); i++) {
                // 如果当前元素比上一步长的元素小，则记录到temp中
                if (comparator.compare(arrayList.get(i), arrayList.get(i - step)) == 1) {
                    temp = arrayList.get(i);
                    // 将其逐一向前比较, 如果还小，则继续向前比较，直到寻找到合适的位置
                    for (j = i; j >= step
                            && (comparator.compare(temp, arrayList.get(j - step)) == 1); j -= step) {
                        // 在前一个元素任然小于temp的情况下，将当前元素与前一个互换
                        arrayList.set(j, arrayList.get(j - step));
                    }
                    arrayList.set(j, temp);
                    temp = null;
                }

            }
        }
    }

}
