package practice.classroom;

public class LoopSecondPractice {
    public static void main(String[] args) {

        /*
        // condition - true/false
        while(condition) {
        // code block
        counter update
        }
         */

        int i = 0;
        while (i < 10) {
            System.out.println("Hello World");
            i++;
        }

        boolean isStudent = false;
        while (!isStudent) {
            System.out.println("Is not the student");
            isStudent = true;
        }

        int x = 5;
        while (x >= 0) {
            System.out.println(x);
            x--;
        }

        int[] nums = {30, 10, 20, 10, 40};
        int ii = 0;
        int sum = 0;
        while (ii < nums.length) {
            sum = sum + nums[ii];
            ii = ii + 1;
        }
        System.out.println("Sum of the numbers:" + sum);

        /*
        do {
        // do something
        } while (condition)
         */
        int counter = 20;
        do {
            System.out.println("Counter number is:" + counter);
            counter--;
        } while ( counter > 0);
    }
}
