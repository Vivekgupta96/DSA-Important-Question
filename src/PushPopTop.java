import java.util.Scanner;
import java.util.Stack;

public class PushPopTop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();

            if (operation == 1) {
                int x = sc.nextInt();
                stack.push(x);

            } else if (operation == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else if (operation == 3) {
                if (stack.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

        sc.close();
    }
}
