import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int maxFromRight = arr[n - 1]; // Rightmost element is always a leader
        result.add(maxFromRight);
        
        // Traverse from second last to the beginning
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        
        // Reverse the result list as leaders were collected in reverse order
        ArrayList<Integer> leadersInOrder = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            leadersInOrder.add(result.get(i));
        }
        
        return leadersInOrder;
    }
}
