import java.util.Scanner;

public class Sort {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select Sorting Algorithm:");
        System.out.println("1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n4. String Sort\n5. Merge Sort");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> bubbleSort();
            case 2 -> selectionSort();
            case 3 -> insertionSort();
            case 4 -> stringBubbleSort();
            case 5 -> runMergeSort();
            default -> System.out.println("Invalid choice.");
        }
    }

    // Helper: Input Integer Array
    private static int[] getIntArray() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    // Helper: Print Array
    private static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    // 1. Bubble Sort
    public static void bubbleSort() {
        int[] arr = getIntArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    // 2. Selection Sort
    public static void selectionSort() {
        int[] arr = getIntArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray(arr);
    }

    // 3. Insertion Sort
    public static void insertionSort() {
        int[] arr = getIntArray();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        printArray(arr);
    }

    // 4. String Bubble Sort
    public static void stringBubbleSort() {
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String s : arr) System.out.print(s + " ");
    }

    // 5. Merge Sort Entry Point
    public static void runMergeSort() {
        int[] arr = getIntArray();
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}