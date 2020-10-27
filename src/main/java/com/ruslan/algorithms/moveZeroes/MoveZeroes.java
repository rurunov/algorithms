package com.ruslan.algorithms.moveZeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) { // это с подстановкой нулей
        int[] newNums = new int[nums.length];
        int notZeroCount = 0;
        int zeroCount = 0;
        for (int count = 0; count <= nums.length - 1; count++) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.print("COUNT = " + count + "/ ");
            int value = nums[count];
            System.out.print("VALUE = " + value + "/ ");
            if (value != 0)
                newNums[notZeroCount++] = value;
            else
                ++zeroCount;
            System.out.print("NOT_ZERO_COUNT = " + notZeroCount + "/ ");
            System.out.print("ZERO_COUNT = " + zeroCount + "\n");

            if (count == newNums.length - 1) {
                for (int i = 0; i < nums.length; i++) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    if (i == nums.length - zeroCount) {
                        nums[i] = 0;
                    }
                    System.out.print("I = " + i + "/ ");
                    nums[i] = newNums[i];
                    System.out.println("NUMS_I = " + nums[i] + "/ ");
                }
            }
        }
    }

}
