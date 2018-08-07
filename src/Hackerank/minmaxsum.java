package Hackerank;

import java.util.Scanner;

public class minmaxsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[5];

        long max = 0, min= 0 , sum =0;
        nums[0] = max = min = sum = in.nextLong(); //Read the first value outside the loop, to handle min calculation
        for (int i = 1; i < 5; i++) {
            nums[i] = in.nextLong();
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
            sum += nums[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));

    }
}
