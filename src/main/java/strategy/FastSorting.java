package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 快速排序
public class FastSorting implements SortStrategy {

    @Override
    public void sort(ArrayList arrayList, Comparator comparator) {
        if (arrayList.isEmpty() || arrayList == null) {
            return;
        }
        recursionSort(0, arrayList.size() - 1, arrayList, comparator);

    }

    // 递归对分区排序
    public void recursionSort(int left, int right, ArrayList arrayList, Comparator comparator) {
        // 递归结束
        if (left >= right) {
            return;
        }

        int i = left, j = right;
        // 基准值
        Object base = arrayList.get(i);
        // 中间变量用于两数交换
        Object temp;

        while (i != j) {

            // 从右边往左边找比基准值小/大(由升序降序决定)的数
            while (comparator.compare(arrayList.get(j), base) != 1 && i < j) {
                j--;
            }
            // 从左向右找比基准值大/小的数
            while (comparator.compare(arrayList.get(i), base) != -1 && i < j) {
                i++;
            }

            // 找到后按下标交换值
            if (i < j) {
                temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, temp);

                temp = null;
            }
        }

        // 将基准值换到对应位置
        arrayList.set(left, arrayList.get(i));
        arrayList.set(i, base);
        // 左区间
        recursionSort(left, i - 1, arrayList, comparator);
        // 右区间
        recursionSort(i + 1, right, arrayList, comparator);
    }

}
