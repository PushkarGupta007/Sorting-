public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 6, 1, 2, 9 };
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            int min = i;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int k = 0; k < l; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}