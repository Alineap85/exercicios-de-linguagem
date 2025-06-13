public class Main {
    public static void main(String[] args) {
        int[] array = {1, 10, 2, 9, 3, 8, 4, 7};
        int number = 1;

        int start = 0;
        int end = array.length-1;
        int result = -1;

        while (start <= end) {
            int middle = start + (end - start) /2;

            if (array[middle] == number) {
                result = middle;
                break;
            } else if (array[middle] < number) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        if (result != -1) {
            System.out.println("Found at " + result + " position");
        } else {
            System.out.println("Do not found");
        }
    }
}