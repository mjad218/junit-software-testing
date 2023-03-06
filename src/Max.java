public class Max {

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i =0 ; i< nums.length;i++)
        {
            if(nums[i] ==9) counter++;
        }
        return counter;
    }

}