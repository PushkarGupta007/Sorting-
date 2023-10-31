
public class h3 {
    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };
        h3 obj = new h3();
        obj.sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public void merge(int arr[], int p, int r, int q) {
        int n1 = p - q + 1;
        int n2 = q - r;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + i];

        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[q + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
        }

    }

    public void sort(int arr[], int p, int r) {
        int q = (p + r) / 2;

        sort(arr, p, q);
        sort(arr, q + 1, r);
        merge(arr, p, q, r);
    }

}
