import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Fur {

        public static void main(String[] args) {
//        System.out.println("Hello");

//        Scanner input = new Scanner(System.in);
//        int output = 0;
//        output = factorialNumber(input.nextInt());

            ArrayList<Integer> output = new ArrayList<>();
            output = happyNumber();

            System.out.print(output);
            // write your code here
        }

        private static ArrayList<Integer> happyNumber() {
            int curr_num = 1;
            int count = 0;
            ArrayList<Integer> happy_number = new ArrayList<Integer>();
//        while(count < 9){
            while(curr_num <= 100){
                if (isHappy(curr_num)) {
                    happy_number.add(curr_num);
                    curr_num++;
                    count++;
                }else{
                    curr_num++;
                }
            }
            return happy_number;
        }

        private static boolean isHappy(int curr_num) {
            ArrayList<Integer> sum = new ArrayList<Integer>();
            while(! sum.contains(curr_num)) {
                if (curr_num == 1) {
                    return true;
                } else {
                    sum.add(curr_num);
                    curr_num = sumSquare(curr_num);
                }
            }
            return false;
        }

        private static int sumSquare(int n) {
            int sum_square = 0;
            int digit = 0;
            while(n/10 >= 1){
                digit = n%10;
                sum_square = sum_square + digit * digit;
                n = (n - digit)/10;
            }
            return sum_square = sum_square + n * n;
        }

        private static int factorialNumber(int n) {
            if (n == 0){
                return 1;
            }else{
                return n * factorialNumber(n-1);
            }
        }

}
