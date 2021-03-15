package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 直接插入排序
public class InsertSorting implements SortStrategy {

    @Override
    public void sort(ArrayList arrayList, Comparator comparator) {
        // 记录与排序规则相符合的索引位置，为插入元素定位
        int insertIndex = -1;
        // 第一个元素有序，从第二个开始
        for (int i = 1; i < arrayList.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                // 与前一个数据进行比较，升序还是降序由comparator具体实现决定
                if (comparator.compare(arrayList.get(i), arrayList.get(j)) == 1) {
                    insertIndex = j;
                } else {
                    // 以升序为例，前段数据已处于有序状态，若比上一个大或相等，直接放在原位置，保持排序的稳定性
                    break;
                }
            }

            // 根据索引修改列表数据
            if (insertIndex != -1) {
                arrayList.add(insertIndex, arrayList.get(i));
                // add 方法插入后，原来的元素后移了一位
                arrayList.remove(i + 1);
                // 恢复定位索引
                insertIndex = -1;
            }

        }
    }
}
