package com.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Q1_TwoNumbersTest {
    @Test
    void test_3_3(){
        var nums = new int[]{3,3};
        var answers = Q1_TwoNumbers.twoSum(nums, 6);
        assertThat(answers[0]).isEqualTo(0);
        assertThat(answers[1]).isEqualTo(1);
    }
    @Test
    void test_2_7_11_15(){
        var nums = new int[]{2,7,11,15};
        var answers = Q1_TwoNumbers.twoSum(nums, 9);
        assertThat(answers[0]).isEqualTo(0);
        assertThat(answers[1]).isEqualTo(1);
    }

    @Test
    void test_3_2_4(){
        var nums = new int[]{3,2,4};
        var answers = Q1_TwoNumbers.twoSum(nums, 6);
        assertThat(answers[0]).isEqualTo(1);
        assertThat(answers[1]).isEqualTo(2);
    }
}
