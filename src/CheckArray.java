public class CheckArray {
    public static boolean Check(int[] numbers) {
        // Use an enhanced for loop to iterate through the array elements.
        for (int number : numbers) {
            // Check if the current number is 0 or -1.
            if (number == 0 || number == -1) {
                // If any number is 0 or -1, return true
                return true;
            }
        }
        // If no number is 0 or -1, return false
        return false;
}
    public static void main(String[] args)
    {
        int[] numbers = {100, 521, -76, -12, 174};
        System.out.println("Contain(s) 0 and/or -1: " + Check(numbers));
        System.out.println("Time complexity: O(n)");
    }
}
