package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        Integer[] arr = {21, 25, 49, 25, 16, 8, 9, 20, 60};
        ArrayList<Integer> arry = new ArrayList<>(Arrays.asList(arr));
        System.out.println("sort before : " + arry);
        Context<Integer> integerContext = new Context<>();
        // 直接插入排序
//        integerContext.setSortStrategy(new InsertSorting());
        // 希尔排序
//        integerContext.setSortStrategy(new ShellSorting());
        // 冒泡排序
//        integerContext.setSortStrategy(new BubbleSort());
        // 快速排序
//        integerContext.setSortStrategy(new FastSorting());
        // 堆排序
        integerContext.setSortStrategy(new HeapSorting());
        // 升序
        integerContext.sortMethod(arry, ((o1, o2) -> -Integer.compare(o1, o2)));

        System.out.println("sort after : " + arry);
    }

}
