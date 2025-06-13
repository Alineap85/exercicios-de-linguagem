import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 10, 2, 9, 3, 8, 4, 7};
        int number = 198;

        Arrays.sort(array);

        int result = binarySearch(array, number, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Found at position " + result);
        } else {
            System.out.println("Do not found :(");
        }
    }

    public static int binarySearch(int[] array, int number, int start, int end) {
        if (start > end) {
            return-1;
        }

        int middle = start + (end - start) / 2;

        if (array[middle] == number) {
            return middle;
        } else if (array[middle] < number) {
            return binarySearch(array, number, middle + 1, end);
        } else {
            return binarySearch(array, number, start, middle - 1);
        }
    }
}