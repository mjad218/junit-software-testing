import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    public void getMaxNegativeValues() {
        Max max = new Max();
        assertEquals( max.intMax(0, -1, -4) ,0);
    }

    @Test
    public void positiveValues() {
        Max max = new Max();
        assertEquals( max.intMax(5, 1, 10) ,10);
    }

    @Test
    public void allEquals() {
        Max max = new Max();
        assertEquals( max.intMax(0, 0,0),0);
    }

    @Test
    public void oneNine() {
        Max max = new Max();
        int [] nums = {9};
        assertEquals( max.arrayCount9(nums) , 1);
    }


    @Test
    public void allNines() {
        Max max = new Max();
        int [] nums = {9,9,9,9,9};
        assertEquals( max.arrayCount9(nums) , 5);
    }

    @Test
    public void noNines() {
        Max max = new Max();
        int [] nums = {0, 3, 5,2, 2,90};
        assertEquals( max.arrayCount9(nums) , 0);
    }
}