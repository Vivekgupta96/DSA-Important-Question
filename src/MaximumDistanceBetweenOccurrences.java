import java.util.*;

import java.util.*;

public class MaximumDistanceBetweenOccurrences {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        HashMap<Integer, Integer> dict = new HashMap<>();

        int maxD = -1;

        for (int i = 0; i < arr.length; i++) {
            if (dict.containsKey(arr[i])) {
                int temp = i - dict.get(arr[i]);
                if (temp > maxD) {
                    maxD = temp;
                }
            } else {
                dict.put(arr[i], i);
            }
        }

        System.out.println(maxD);

    }
}
