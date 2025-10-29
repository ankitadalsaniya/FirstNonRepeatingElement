import java.util.*;

public class FirstNonRepeatingElement {
    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first non-repeating element
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 4, 2, 3, 7, 3, 1, 6, 1};
        int result = findFirstNonRepeating(arr);
        if (result != -1)
            System.out.println("First non-repeating element: " + result);
        else
            System.out.println("No non-repeating element found");
    }
}
