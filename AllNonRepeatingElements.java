import java.util.*;

public class AllNonRepeatingElements {
    public static List<Integer> findAllNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect all non-repeating elements
        List<Integer> uniqueElements = new ArrayList<>();
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                uniqueElements.add(num);
            }
        }

        return uniqueElements;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 7, 4, 2, 3, 7, 3, 1, 6, 1, 11, 12, 6};
        List<Integer> result = findAllNonRepeating(arr);

        if (!result.isEmpty())
            System.out.println("All non-repeating elements: " + result);
        else
            System.out.println("No non-repeating elements found");
    }
}
