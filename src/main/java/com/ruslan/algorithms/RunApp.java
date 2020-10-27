package com.ruslan.algorithms;

import com.ruslan.algorithms.moveZeroes.MoveZeroes;

import java.util.Arrays;

public class RunApp {
    public static void main(String[] args) {
//        int[] nums = new int[] {0,1,0,3,12};
        int[] nums = new int[]{0, 1, 0, 3, 12, 0, 5, 0, 2}; // пробный, для большего кол-ва
        MoveZeroes mvZeroes = new MoveZeroes();
        mvZeroes.moveZeroes(nums);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(Arrays.toString(nums));
    }
}
