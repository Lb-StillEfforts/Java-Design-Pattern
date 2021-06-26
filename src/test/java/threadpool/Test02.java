package threadpool;

public class Test02 {

    public static void main(String[] args) {

        int arr[] = {4, 3, 9, 6};

        int max = arr[0] >= arr[1] ? arr[0] : arr[1];
        int secondMax = arr[0] < arr[1] ? arr[0] : arr[1];

        for (int j = 2; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            } else if (arr[j] > secondMax) {
                secondMax = arr[j];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }

}
