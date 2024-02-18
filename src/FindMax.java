public class FindMax {
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {100, 521, -76, -12, 174};
        int result = findMax(numbers);
        System.out.println("The maximum value is: " + result);
        System.out.println("Time complexity: O(n)");
    }
}
