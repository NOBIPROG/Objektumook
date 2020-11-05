package Óraimunka1030;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Óraimunka {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> numbersOrder = new Stack();
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            numbersOrder.push(nums[i]);

        }
        System.out.println("Stack" + numbersOrder);
        System.out.println(numbersOrder.peek());
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbersOrder.pop();

        }
        System.out.println(Arrays.toString(nums));
        System.out.println("..........");
        System.out.println("Method" + Arrays.toString(queueMethod(nums)));
        recu(10);

    }

    public static int[] queueMethod(int[] needSort) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> numbersFirstOrder = new Stack();
        Stack<Integer> numbersSecondOrder = new Stack();
        int[] sorted = new int[needSort.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = 100;
        }
        for (int i = 0; i < nums.length; i++) {
            numbersFirstOrder.push(nums[i]);

        }
        for (int i = 0; i < numbersFirstOrder.capacity(); i++) {
            System.out.println(numbersFirstOrder);
            numbersSecondOrder.push(numbersFirstOrder.pop());
            System.out.println(numbersSecondOrder);


        }
        for (int i = 0; i < numbersSecondOrder.capacity(); i++) {
            sorted[i] = numbersSecondOrder.pop();
            System.out.println(Arrays.toString(sorted));
        }
        return sorted;

    }

    public static void recu(int number) {
        Stack<Integer> nums = new Stack<>();

        int sum = 0;
        nums.push(number);
        while (!nums.isEmpty()) {
            int n = nums.pop();
            if (n == 1 || n == 0) {
                sum += n;

            } else {
                nums.push(n - 1);
                nums.push(n - 2);
            }
        }
        System.out.println(sum);
    }
}
