public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 4, 2, 9, 5 };
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
