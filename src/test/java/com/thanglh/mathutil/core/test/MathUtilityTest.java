package com.thanglh.mathutil.core.test;

import com.thanglh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case structure : ID, Description, Step/Procedures
    //                      Expected Result, Status (Passed, Failed)
    //                      Bug ID( Bugzilla, jira)
    //Test case 4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
//       MathUtility.getFactorial(-5); chưa bắt xem có ngoại le nhu ki vong hay khong
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
    }

    //Thấy ngoaại lệ, mừng rơi nước mắt
    //Vì hàm thiết kế đưa N<0 hoặc N>20 thì ngoại l phải udwojcd ném ra
    //Vậy nếu hm ném ngoại le khi N=-5 ro ràng là hàm đúng, hàm đúng thi phai xanh
    //Xanh vi tra ve ngoai le dung nhu ki vong

    //Test case #2: check getFactorial() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnWell() {

        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }


    //test case structure: ID, Description, Step/procedures, expected result, status (passed, failed)
    // bug ID (bugzilla, Jira)


    //test case #1: check getFactorial() with n = 0
    @Test
    public void testFactorialGivenRightArgument0ReturnWell() {
        int n = 0;
        long expectedValue = 1; //hi vọng 0! trả về 1
        long actualValue = MathUtility.getFactorial(n); //giả bộ hàm trả về 10

        //SO SÁNH 2 THẰNG EXPECTED VS ACTUAL
        assertEquals(expectedValue, actualValue);
    }

}