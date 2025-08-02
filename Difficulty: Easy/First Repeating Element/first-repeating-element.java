
import java.util.HashMap;

class Solution {
    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1;
            }
        }

        return -1;
    }
}
