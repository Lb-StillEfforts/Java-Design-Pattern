package strategy;

import java.util.ArrayList;
import java.util.Comparator;

// 堆排序
public class HeapSorting implements SortStrategy {

    @Override
    public void sort(ArrayList arrayList, Comparator comparator) {

        // 根据数组初始化一个最大(小)堆
        for (int i = (arrayList.size() - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(i, arrayList.size(), arrayList, comparator);
        }

        // 调整堆结构+交换堆顶元素与末尾元素
        for (int i = arrayList.size() - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            swap(arrayList, 0, i);
            //重新对堆进行调整, 从根节点开始向下比较
            adjustHeap(0, i, arrayList, comparator);
        }
    }


    public void adjustHeap(int i, int len, ArrayList arrayList, Comparator comparator) {
        // 取出当前元素
        Object temp = arrayList.get(i);

        int leftNode = 2 * i + 1;

        // 左节点存在
        while (leftNode < len) {
            int rightNode = leftNode + 1;

            int index = leftNode;
            // 右节点存在
            if (rightNode < len) {
                // 比较两2个子节点哪个更大/小，并记录其下标
                index = comparator.compare(arrayList.get(leftNode), arrayList.get(rightNode)) == -1 ? leftNode : rightNode;
            }

            // 较大的一个与父节点比较，若没有右节点，则直接和左节点比较
            if (comparator.compare(arrayList.get(index), temp) == -1) {
                arrayList.set(i, arrayList.get(index));
            } else {
                break;
            }

            i = index;
            leftNode = 2 * i + 1;

        }
        arrayList.set(i, temp);
    }

    // 交换函数
    public void swap(ArrayList arrayList, int a, int b) {
        Object temp = arrayList.get(a);
        arrayList.set(a, arrayList.get(b));
        arrayList.set(b, temp);
    }
}
