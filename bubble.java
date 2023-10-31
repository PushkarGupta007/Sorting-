public class bubble {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 4, 9, 1 };
        int l = arr.length;

        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < l; k++) {
            System.out.print(arr[k] + " ");
        }

    }

}
