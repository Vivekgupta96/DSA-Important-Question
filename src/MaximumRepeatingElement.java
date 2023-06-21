import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatingElement {
    public static int findMaxRepeatingElement(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int el : array) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }

        int maxRepeEle = -1;
        int max = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxRepeEle = entry.getKey();

            }
        }
        return maxRepeEle;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5, 2, 6, 2, 2};
        int maxRepeatingElement = findMaxRepeatingElement(array);

        System.out.println("Maximum repeating element: " + maxRepeatingElement);
    }
}
