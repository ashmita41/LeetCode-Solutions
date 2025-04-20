import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort using custom comparator
        Integer[] boxedNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNums, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB); // ascending frequency
            } else {
                return Integer.compare(b, a); // descending value
            }
        });

        // Step 3: Unbox and return
        return Arrays.stream(boxedNums).mapToInt(i -> i).toArray();
    }
}
