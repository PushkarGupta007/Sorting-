public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 3, 8, 2, 9 };
        int n = arr.length - 1;
        sort(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void sort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            sort(arr, lb, loc - 1);
            sort(arr, loc + 1, ub);
        }
    }

    public static int partition(int arr[], int lb, int ub) {
        int start = lb;
        int pivot = arr[lb];
        int end = ub;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }

        }
        swap(arr, lb, end);
        return end;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
